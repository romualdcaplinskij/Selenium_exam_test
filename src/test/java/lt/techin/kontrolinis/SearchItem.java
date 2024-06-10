package lt.techin.kontrolinis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchItem extends TestSetup{
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/products.csv", numLinesToSkip = 1)
    public void searchTest(String product){
        mainPage.enterSearch(product);
        Assertions.assertEquals(product.toLowerCase(), searchResult.itemTitleFromSearchResult().toLowerCase());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/products.csv", numLinesToSkip = 1)
    void likeTest(String product) throws InterruptedException {
        String modalAlert = "You need to be logged in to save products in your wishlist.";
        mainPage.enterSearch(product);
        searchResult.chooseProduct();
        productPage.clickWishlist();

        Assertions.assertEquals(modalAlert, productPage.alertMessage(), "User is signed in");
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".modal-header"))));

        //Thread.sleep(5000);
        //System.out.println(productPage.alertMessage());
        //productPage.cancelButton();

        //"element not interactable" closeAlert doesn't work?
    }


}
