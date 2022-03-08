public class ModeSwitch {
    private ModeState modeState = new ModeStateLight();

    public void setState(ModeState _ModeState) {
        modeState = _ModeState;
    }

    public void onSwitch() {
        modeState.toggle(this);
    }
}