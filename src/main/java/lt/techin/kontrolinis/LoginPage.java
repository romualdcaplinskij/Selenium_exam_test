package lt.techin.kontrolinis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "[data-link-action='display-register-form']")
    private WebElement createAccountButton;

    @FindBy (css = "#field-email")
    private WebElement emailField;

    @FindBy (css = "#field-password")
    private WebElement passwordField;

    @FindBy (css = "#submit-login")
    private WebElement signInButton;

    public void clickSignIn(){
        signInButton.click();
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void enterEmail(String email){
        emailField.sendKeys(email);
    }

    public void clickCreateAccount(){
        createAccountButton.click();
    }
}
