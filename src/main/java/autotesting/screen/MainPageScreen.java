package autotesting.screen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainPageScreen extends BaseScreen {
    private static final String SITE_URL = "https://vk.com";
    private static final String INPUT_LOGIN_XPATH = "//input[@id='quick_email']";
    private static final String INPUT_PASSWORD_XPATH = "//input[@id='quick_pass']";
    private static final String SUBMIT_BUTTON_XPATH = "//button[@id='quick_login_button']";
    private static final String LINK_MENU_ITEM_FRIEND_XPATH = "//div[@id='side_bar']/ol/li[2]/a[@class='left_row']";
    private static final String REQUEST_FRIENDS_XPATH = "//li[@id='tab_requests']/a";
    private static final String OUTGOING_REQUEST_FRIENDS_XPATH = "//div[@class='summary_tab3']/nobr[text()='Исходящие заявки']";
    private static final String BUTTON_CANCEL_REQUESTS = "//button[text()='Отменить заявку и отписаться']";
    private static final String COUNT_FRIENDS = "//div[@class='summary_wrap' and contains(div, 'Вы подали заявку')]";

    public MainPageScreen openURL(){
        driver.get(SITE_URL);
        return this;
    }

    public MainPageScreen inputLogin() {
        driver.enterTextByXpath(INPUT_LOGIN_XPATH, "");
        return this;
    }

    public MainPageScreen inputPassword() {
        driver.enterTextByXpath(INPUT_PASSWORD_XPATH, "");
        return this;
    }

    public MainPageScreen clickLoginButton() {
        driver.clickByXpath(SUBMIT_BUTTON_XPATH);
        return this;
    }

    public MainPageScreen clickMenuItemFriends() {
        driver.clickByXpath(LINK_MENU_ITEM_FRIEND_XPATH);
        return this;
    }

    public MainPageScreen inputListRequestsFriends() {
        driver.clickByXpath(REQUEST_FRIENDS_XPATH);
        return this;
    }

    public MainPageScreen inputListOutgoingRequests() {
        driver.clickByXpath(OUTGOING_REQUEST_FRIENDS_XPATH);
        return this;
    }

    public MainPageScreen clickCancelButton() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Pattern pattern = Pattern.compile("\\d+");
        String word = driver.getText(COUNT_FRIENDS);
        Matcher matcher = pattern.matcher(word);
        int start = 0;
        int result = 0;
        while (matcher.find(start)) {
            String value = word.substring(matcher.start(), matcher.end());
            result = Integer.parseInt(value);
            start = matcher.end();
        }
        for (int j = 0; j < result; j++) {
            driver.clickByXpath(BUTTON_CANCEL_REQUESTS);
        }
        return this;
    }

    public MainPageScreen closeBrowser(){
        driver.quit();
        return this;
    }
}
