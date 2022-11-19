package xnopre;

import org.junit.Test;

import java.util.Arrays;

import static org.mockito.Mockito.*;

public class DataAnalyzerTest {
    @Test
    public void test() {

        // Préparation de la classe à tester et de ses collaborateurs mockés
        Dao mockDao = mock(Dao.class);
        UserFilter mockUserFilter = mock(UserFilter.class);
        UserTransformer mockUserTransformer = mock(UserTransformer.class);
        Sender mockSender = mock(Sender.class);
        DataAnalyzer dataAnalyzer = new DataAnalyzer(mockDao, mockUserFilter, mockUserTransformer, mockSender);

        // Comportement pour les mocks
        User user1 = new User("Bob", "Dylan");
        User user2 = new User("John", "Wayne");
        when(mockDao.getAllUsers()).thenReturn(Arrays.asList(user1, user2));
        when(mockUserFilter.filter(Arrays.asList(user1, user2))).thenReturn(Arrays.asList(user2));
        when(mockUserTransformer.transform(Arrays.asList(user2))).thenReturn(Arrays.asList("John Wayne"));

        // Action
        dataAnalyzer.processAllUsers();

        // Vérification
        verify(mockSender).transmit(Arrays.asList("John Wayne"));
    }
}
