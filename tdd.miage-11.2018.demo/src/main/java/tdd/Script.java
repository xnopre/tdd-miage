package tdd;

public class Script {
    private SUtils sUtils;

    public Script(SUtils sUtils) {
        this.sUtils = sUtils;
    }

    public void deploy(String host) {
        try {
            sUtils.scp("host1", "config.json");
        } catch (IllegalStateException e) {
            return;
        }
        sUtils.ssh("host1", "restart");
    }
}
