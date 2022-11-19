package xnopre;

import java.util.List;

public class DataAnalyzer {
    private final Dao dao;
    private final UserFilter userFilter;
    private final UserTransformer userTransformer;
    private final Sender sender;

    public DataAnalyzer(Dao dao, UserFilter userFilter, UserTransformer userTransformer, Sender sender) {
        this.dao = dao;
        this.userFilter = userFilter;
        this.userTransformer = userTransformer;
        this.sender = sender;
    }

    public void processAllUsers() {
        final List<User> allUsers = this.dao.getAllUsers();
        final List<User> allUsersFiltered = this.userFilter.filter(allUsers);
        final List<String> usersFullnames = this.userTransformer.transform(allUsersFiltered);
        this.sender.transmit(usersFullnames);
    }
}
