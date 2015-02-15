package autotesting.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverWrapper extends FirefoxDriver{
    public void clickByXpath(String xpath) {
        findElement(By.xpath(xpath)).click();
    }

    public String getData(String xpath){
        String data = findElement(By.xpath(xpath)).getText();
        return data;
    }

    public String getDate(String xpath){
        String data = findElement(By.xpath(xpath)).getText();
        return data;
    }
}
