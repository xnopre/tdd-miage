package xnopre;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ScriptTest {

    @Test
    public void should_call_2_actions() {

        Utils utils = mock(Utils.class);
        MyScript script = new MyScript(utils);

        script.deploy("host1");

        verify(utils).scp("host1", "config.json");
        verify(utils).ssh("host1", "restart");

    }

    @Test
    public void should_call_only_1_actions() {

        Utils utils = mock(Utils.class);
        MyScript script = new MyScript(utils);
        doThrow(new IllegalStateException()).when(utils).scp("host1", "config.json");

        script.deploy("host1");

        verify(utils).scp("host1", "config.json");
        verifyNoMoreInteractions(utils);

    }
}
