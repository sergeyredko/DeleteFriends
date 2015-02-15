package autotesting.screen;

public class MainPageScreen extends BaseScreen {
    private static final String SITE_URL = "http://pogoda.by";
    private static final String LINK_OTHER_COUNTRY = "//a[text()='ДРУГИЕ СТРАНЫ']";
    private static final String LINK_CITY_WARSHAWA = "//a[text()='Варшава']";
    private static final String ACTUAL_TEMPERATURE = "/html/body/div[4]/div[3]/table/tbody/tr[3]/td[3]";
    private static final String ACTUAL_DATE = "/html/body/div[4]/div[3]/table/tbody/tr[1]/td[3]";

    public MainPageScreen openURL(){
        driver.get(SITE_URL);
        return this;
    }

    public MainPageScreen clickOtherCountry(){
        driver.clickByXpath(LINK_OTHER_COUNTRY);
        return this;
    }

    public MainPageScreen clickByCity(){
        driver.clickByXpath(LINK_CITY_WARSHAWA);
        return this;
    }

    public MainPageScreen getDate(){
        log.info(String.format("Дата: '%s'", driver.getDate(ACTUAL_DATE)));
        return this;
    }

    public MainPageScreen getTemperature(){
        log.info(String.format("Погода: '%s'", driver.getData(ACTUAL_TEMPERATURE)));
        return this;
    }

    public MainPageScreen closeBrowser(){
        driver.quit();
        return this;
    }
}
