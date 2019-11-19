package xnopre;

public class MyScript {
    private Utils utils;

    public MyScript(Utils utils) {
        this.utils = utils;
    }

    public void deploy(String host) {
        try {
            utils.scp(host, "config.json");
            utils.ssh(host, "restart");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
