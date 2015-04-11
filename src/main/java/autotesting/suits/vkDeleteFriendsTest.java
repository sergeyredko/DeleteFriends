package autotesting.suits;

import autotesting.screen.MainPageScreen;
import org.testng.annotations.Test;

public class vkDeleteFriendsTest {

    protected MainPageScreen mainPageScreen;

    @Test(description = "Удаление заявок в друзья")
    public void vkDeleteFriendsTest() {
        mainPageScreen = new MainPageScreen().openURL();
        mainPageScreen.inputLogin();
        mainPageScreen.inputPassword();
        mainPageScreen.clickLoginButton();
        mainPageScreen.clickMenuItemFriends();
        mainPageScreen.inputListRequestsFriends();
        mainPageScreen.inputListOutgoingRequests();
        mainPageScreen.clickCancelButton();
        mainPageScreen.closeBrowser();
    }
}
