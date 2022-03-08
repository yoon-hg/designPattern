public class Settings{
    
    private Settings() {};

    private static Settings settings = null;

    // settings를 어디선가 선언을 했으면 Settings 값을 가져가고, 선언하지 않았으면 선언한다.
    // static으로 정적으로 선언하여 새로 선언하지 않도록 설정한다. 
    public static Settings getSettings () {
        if(settings == null) {
             settings = new Settings();
        }
        return settings;
    }

    // 멀티 쓰레드 상황에서 동시 접근을 막는 방법 (synchronized)
    // public synchronized static Settings getSettings () {
    //     if(settings == null) {
    //          settings = new Settings();
    //     }
    //     return settings;
    // }

    private boolean darkMode = false;
    private int fontSize = 13;

    public boolean getDarkMode () {return darkMode;}
    public int getFontSize () {return fontSize;}

    public void setDarkMode (boolean _darkMode) {
        darkMode = _darkMode;
    }

    public void setFontSize(int _fontSize){
        fontSize = _fontSize;
    }
}