import java.net.SocketTimeoutException;

public interface ModeState {
    public void toggle(ModeSwitch modeSwitch);
}

class ModeStateLight implements ModeState {
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("from light to dark");
        modeSwitch.setState(new ModeStateDark());
    }
}

class ModeStateDark implements ModeState {
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("from light to light");
        modeSwitch.setState(new ModeStateLight());
    }
}