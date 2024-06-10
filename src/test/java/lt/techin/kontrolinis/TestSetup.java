package lt.techin.kontrolinis;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestSetup {
    WebDriver driver;
    protected MainPage mainPage;
    protected LoginPage loginPage;
    protected RegistrationPage registrationPage;
    protected SearchResult searchResult;
    protected ProductPage productPage;

    protected WebDriverWait wait;

    @BeforeEach
    public void setDriver(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        driver.manage().window().maximize();
        driver.get("http://192.168.88.69/");
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        searchResult = new SearchResult(driver);
        productPage = new ProductPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    @AfterEach
    public void quit(){
      driver.quit();
    }
}
