package lt.techin.kontrolinis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResult extends BasePage{
    public SearchResult(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "h2 > a")
    private WebElement itemTitle;

    @FindBy (css = ".wishlist-button-add")
    private WebElement wishListButton;

    @FindBy (css = ".product-miniature")
    private WebElement productMiniature;


    public void chooseProduct(){
        productMiniature.click();
    }

    public String itemTitleFromSearchResult(){
        return itemTitle.getText();
    }

}
