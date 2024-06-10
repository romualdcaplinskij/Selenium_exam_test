package lt.techin.kontrolinis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserLogin extends TestSetup{

    @Test
    void testValidUserSignIn(){
        String email = "homers@mail.com";
        String password = "sunnydays2024";
        mainPage.clickSignIn();
        loginPage.waitPageToLoad();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickSignIn();
        Assertions.assertTrue(mainPage.isSignOutDisplayed(), "Login Failed");
    }
}
