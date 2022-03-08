public class App {
    public static void main(String[] args) throws Exception {

        final ModeSwitch modeSwitch = new ModeSwitch();

        modeSwitch.onSwitch(); // dark;
        modeSwitch.onSwitch(); // light;
        modeSwitch.onSwitch(); // dark;
        modeSwitch.onSwitch(); // ligth;
    }
}
