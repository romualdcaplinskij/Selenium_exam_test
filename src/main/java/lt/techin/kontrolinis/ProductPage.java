package lt.techin.kontrolinis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".wishlist-button-product")
    private WebElement wishlistButton;

    @FindBy (css = ".modal-text")
    private WebElement modalAlertText;

    @FindBy (css = ".wishlist-login > div[role='dialog'] > div[role='document'] .btn.btn-secondary.modal-cancel")
    private WebElement modalAlertCancel;

    @FindBy (css = "select[name='group[1]']")
    private WebElement sizeSelector;

    @FindBy (css = "option")
    private WebElement chooseSize;

    @FindBy (css = ".add-to-cart.btn.btn-primary")
    private WebElement addToCart;

    @FindBy (css = "#myModalLabel")
    private WebElement modalSuccessMessage;

    @FindBy (css = ".cart-content-btn .btn-primary")
    private WebElement checkoutButton;

    @FindBy (css = "[data-id_customization]")
    private WebElement productNameInCart;

    @FindBy (css = ".product-line-info.size > .value")
    private WebElement productSizeInCart;

    @FindBy (css = ".discount.discount-percentage")
    private WebElement discountInCart;

    public int getDiscountValue(){
        return Integer.parseInt(discountInCart.getText().substring(1, discountInCart.getText().length()-1));
    }

    public String getProductSizeInCart(){
        return productSizeInCart.getText();
    }

    public String getProductNameInCart(){
        return productNameInCart.getText().toLowerCase();
    }

    public void proceedToCheckout(){
        checkoutButton.click();
    }

    public String itemSuccessfullyAddedMsg(){
        return modalSuccessMessage.getText().substring(1);
    }

    public void addToCart(){
        addToCart.click();
    }

    public void clickToChooseSize(String size){
        Select dropdown = new Select(sizeSelector);
        dropdown.selectByVisibleText(size);
    }

    public void cancelButton(){
         modalAlertCancel.click();
    }

    public void closeModalAlert(){
        modalAlertCancel.click();
    }

    public String alertMessage(){
        return modalAlertText.getText();
    }

    public void clickWishlist(){
        wishlistButton.click();
    }

}
