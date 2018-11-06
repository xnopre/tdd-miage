package tdd;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class ScriptTest {
    @Test
    public void should_do_actions() {
        SUtils scriptUtils = mock(SUtils.class);
        Script script = new Script(scriptUtils);

        script.deploy("host1");

        verify(scriptUtils).scp("host1", "config.json");
        verify(scriptUtils).ssh("host1", "restart");
    }

    @Test
    public void should_do_one_action_if_problem() {
        SUtils scriptUtils = mock(SUtils.class);
        Script script = new Script(scriptUtils);

        doThrow(new IllegalStateException()).when(scriptUtils).scp("host1", "config.json");
        script.deploy("host1");

        verify(scriptUtils).scp("host1", "config.json");
        verifyNoMoreInteractions(scriptUtils);
    }
}
