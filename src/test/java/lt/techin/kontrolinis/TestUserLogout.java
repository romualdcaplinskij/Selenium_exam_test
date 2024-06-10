package lt.techin.kontrolinis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserLogout extends TestSetup{

    @Test
    void clickLogout(){
        String email = "homers@mail.com";
        String password = "sunnydays2024";
        mainPage.clickSignIn();
        loginPage.waitPageToLoad();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickSignIn();
        mainPage.clickSignOut();
        Assertions.assertTrue(mainPage.isSignInDisplayed(), "Logout failed");
    }
}
