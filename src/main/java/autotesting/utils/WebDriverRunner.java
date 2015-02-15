package autotesting.utils;

public class WebDriverRunner {
    private static WebDriverWrapper driver;

    public WebDriverRunner() {
        try {
            driver = new WebDriverWrapper();
        }
        catch (Exception e){
            System.out.println("Драйвер не создался");
        }
    }

    public static WebDriverWrapper getDriver(){
        if (driver == null){
            new WebDriverRunner();
        }
        return driver;
    }

}
