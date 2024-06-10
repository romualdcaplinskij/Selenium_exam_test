package lt.techin.kontrolinis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void waitPageToLoad() {
        driver.manage().
                timeouts().
                getPageLoadTimeout();
    }
}
