package xnopre;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class ScriptTest {
    @Test
    public void should_send_scp_and_ssh() {
        Utils utils = mock(Utils.class);
        Script script = new Script(utils);

        script.deploy("host1");

        verify(utils).scp("host1", "config.json");
        verify(utils).ssh("host1", "restart");
    }

    @Test
    public void should_not_call_ssh_if_scp_failed() {
        Utils utils = mock(Utils.class);
        Script script = new Script(utils);
        doThrow(new IllegalStateException()).when(utils).scp(anyString(), anyString());

        script.deploy("host1");

        verify(utils).scp("host1", "config.json");
        verifyNoMoreInteractions(utils);

    }
}
