package autotesting.suits;

import autotesting.screen.MainPageScreen;
import org.testng.annotations.Test;

public class MainPogodaTest {
    protected MainPageScreen mainPageScreen;

    @Test
    public void pogodaPageTest(){
        mainPageScreen = new MainPageScreen().openURL();
        mainPageScreen.clickOtherCountry();
        mainPageScreen.clickByCity();
        mainPageScreen.getDate();
        mainPageScreen.getTemperature();
        mainPageScreen.closeBrowser();
    }
}
