package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Homepage {
    WebDriver driver;


    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement sauceLabsBackPackAddToCartButton;
    @FindBy(xpath = "//div[text()='$ 9.99']")
    WebElement bikePrice;
    @FindBy(xpath = "//div[text()='$ 29.99']")
    WebElement bikeBackPack;



    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement BikeLightAddToCartButton;

    @FindBy(className = "inventory_item_price")
    List<WebElement> itemPricesLabel;

    public Homepage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }



    public void clickOnAddSauceLabsBackPackToCartButton(){
        sauceLabsBackPackAddToCartButton.click();
    }
    public void clickOnAddBikeLightToCartButton(){
        BikeLightAddToCartButton.click();
    }


    public boolean addToCartSauceLabsBackPackButtonIsDisplayed(){
        boolean addToCartButtonIsDisplayed = sauceLabsBackPackAddToCartButton.isDisplayed();
        return addToCartButtonIsDisplayed;
    }

    public void clickOnCartIcon(){cartIcon.click();}
    public List<Double> getAllItemPrices(){
        List<Double> prices = new ArrayList<>();

        for (WebElement itemPrice: itemPricesLabel) {
            String itemPriceText = itemPrice.getText();
            StringBuilder sb = new StringBuilder(itemPriceText);
            sb.deleteCharAt(0);
            prices.add(Double.parseDouble(sb.toString()));
        }
        return prices;
    }

}
