package lt.techin.kontrolinis;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestCart extends TestSetup{

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/products.csv", numLinesToSkip = 1)
    void testAddingToCart(String product, double price, int discount, String size) {
        String successMessage = "Product successfully added to your shopping cart";
        mainPage.enterSearch(product);
        searchResult.chooseProduct();
        productPage.clickToChooseSize(size);
        productPage.addToCart();

        //wait until modal alert is visible
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("h4#myModalLabel"))));

        //Assertion checks if success message appears
        Assertions.assertEquals(successMessage, productPage.itemSuccessfullyAddedMsg(), "Error while adding to cart");
        System.out.println(productPage.itemSuccessfullyAddedMsg());

        //Item is added to cart
        productPage.proceedToCheckout();

        //Assertions check if product name, size and discount is applied correctly
        Assertions.assertEquals(product.toLowerCase(), productPage.getProductNameInCart(), "Product name don't match");
        Assertions.assertEquals(size, productPage.getProductSizeInCart(), "Product size don't match");
        Assertions.assertEquals(discount, productPage.getDiscountValue(), "Discount value don't match");
    }
}
