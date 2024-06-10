package lt.techin.kontrolinis;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".user-info [title]")
    private WebElement signIn;

    @FindBy (css = ".hidden-sm-down.logout")
    private WebElement signOutButton;

    @FindBy (css = "input[name='s']")
    private WebElement searchField;

    public void enterSearch(String name){
        searchField.sendKeys(name);
        searchField.sendKeys(Keys.ENTER);
    }

    public boolean isSignInDisplayed(){
        return signIn.isDisplayed();
    }

    public void clickSignOut(){
        signOutButton.click();
    }

    public boolean isSignOutDisplayed(){
        return signOutButton.isDisplayed();
    }

    public void clickSignIn(){
        signIn.click();
    }
}
