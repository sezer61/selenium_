

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    By addToCartButtonLocator = By.id("add-to-cart-button");
    By addToCartButtonLocatorr = By.id("attach-sidesheet-view-cart-button");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);
    }

    public void addToCart() throws InterruptedException {

        click(addToCartButtonLocator);
        Thread.sleep(3000);
    }
    public void addToCart2() {
        click(addToCartButtonLocatorr);
    }
}
