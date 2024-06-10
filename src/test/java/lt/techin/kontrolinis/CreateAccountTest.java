package lt.techin.kontrolinis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateAccountTest extends TestSetup{

    @Test
    public void goToLoginPage(){
        String successMessage = "Create an account";
        mainPage.clickSignIn();
        loginPage.clickCreateAccount();
        Assertions.assertEquals(successMessage, registrationPage.getBannerMessage(), "Page is not displayed");
    }

    @Test
    void validUser(){
        String firstName = "Homer";
        String lastName = "Simpson";
        String email = "homers@mail.com";
        String password = "sunnydays2024";
        String birthDate = "05/22/1960";
        mainPage.clickSignIn();
        loginPage.waitPageToLoad();
        loginPage.clickCreateAccount();
        registrationPage.waitPageToLoad();
        registrationPage.checkMrSocialTitle();
        registrationPage.enterFirstName(firstName);
        registrationPage.enterLastName(lastName);
        registrationPage.enterEmail(email);
        registrationPage.enterPassword(password);
        registrationPage.enterBirthDate(birthDate);
        registrationPage.clickReceiveOffers();
        registrationPage.clickAgreeToTerms();
        registrationPage.clickReceiveNewsletter();
        registrationPage.clickCustomerDataPrivacy();
        registrationPage.clickSubmitForm();

        //check if in case of successful creation of the user account, user is logged and main page is displayed.
        Assertions.assertTrue(mainPage.isSignOutDisplayed(), "User already exists or wrong credentials");

    }
}
