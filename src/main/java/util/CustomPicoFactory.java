package util;

public class CustomPicoFactory extends Pico {

    public CustomPicoFactory(){
        System.setProperty("browser","chrome");
        if ("chrome".equals(System.getProperty("browser"))){
            addClass(ChromeUtility.class);
        }else
            addClass(FirefoxUtility.class);
    }


}
