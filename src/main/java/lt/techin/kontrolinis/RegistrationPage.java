package lt.techin.kontrolinis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "h1")
    private WebElement createAccBanner;

    @FindBy (css = "#field-id_gender-1")
    private WebElement mrSocialTitleRadio;

    @FindBy (css = "#field-firstname")
    private WebElement firstNameField;

    @FindBy (css = "#field-lastname")
    private WebElement lastNameField;

    @FindBy (css = "#field-email")
    private WebElement emailField;

    @FindBy (css = "#field-password")
    private WebElement passwordField;

    @FindBy (css = "#field-birthday")
    private WebElement birthdayField;

    @FindBy (css = "input[name='optin']")
    private WebElement offersCheckBox;

    @FindBy (css = "input[name='psgdpr']")
    private WebElement termsAndCondCheckBox;

    @FindBy (css = "input[name='newsletter']")
    private WebElement newsletterCheckBox;

    @FindBy (css = "input[name='customer_privacy']")
    private WebElement customerDataCheckbox;

    @FindBy (css = ".btn.btn-primary.float-xs-right.form-control-submit")
    private WebElement submitButton;


    public void clickSubmitForm(){
        submitButton.click();
    }

    public void clickCustomerDataPrivacy(){
        customerDataCheckbox.click();
    }

    public void clickReceiveNewsletter(){
        newsletterCheckBox.click();
    }

    public void clickAgreeToTerms(){
        termsAndCondCheckBox.click();
    }

    public void clickReceiveOffers(){
        offersCheckBox.click();
    }

    public void enterBirthDate(String birthdate){
        birthdayField.sendKeys(birthdate);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void enterEmail(String email){
        emailField.sendKeys(email);
    }

    public void enterLastName(String lastname){
        lastNameField.sendKeys(lastname);
    }

    public void enterFirstName(String name){
        firstNameField.sendKeys(name);
    }

    public void checkMrSocialTitle(){
        mrSocialTitleRadio.click();
    }

    public String getBannerMessage(){
        return createAccBanner.getText();
    }



}
