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
import java.util.Collections;
import java.util.List;

public class Homepage {
    WebDriver driver;

    @FindBy(className = "app_logo")
    WebElement appLogo;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement sauceLabsBackPackAddToCartButton;

    @FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
    WebElement BikeLight;

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement sauceLabsBackPackRemoveToCartButton;

    @FindBy(id= "react-burger-menu-btn")
    WebElement MenuLinesButton;

    @FindBy(id = "about_sidebar_link")
    WebElement aboutOption;

    @FindBy(id="logout_sidebar_link")
    WebElement logoutLink;

    @FindBy(id="reset_sidebar_link")
    WebElement resetAppStateLink;

    @FindBy(className = "product_sort_container")
    WebElement productFilter;

    @FindBy(className = "inventory_item_price")
    List<WebElement> itemPricesLabel;

    @FindBy(className = "inventory_item_name")
    List<WebElement> itemNamesLabel;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement BikeLightAddToCartButton;

    public Homepage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean appLogoIsDisplayed() {
        boolean appLogoIsDisplayed = appLogo.isDisplayed();
        return appLogoIsDisplayed;
    }

    public String getCartIconText(){
        String cartText = cartIcon.getText();
        return cartText;
    }

    public void clickOnAddSauceLabsBackPackToCartButton(){
        sauceLabsBackPackAddToCartButton.click();
    }

    public void clickBikeLightItem(){BikeLight.click();}
    public void clickOnAddBikeLightToCartButton(){
        BikeLightAddToCartButton.click();
    }


    public void clickOnCart(){cartIcon.click();
    }

    public void clickOnMenuLinesButton(){
        MenuLinesButton.click();
    }



    public void clickOnAboutOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(aboutOption));
        aboutOption.click();
    }

    public void clickOnResetAppStateLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(resetAppStateLink));
        resetAppStateLink.click();
    }

    public boolean addToCartSauceLabsBackPackButtonIsDisplayed(){
        boolean addToCartButtonIsDisplayed = sauceLabsBackPackAddToCartButton.isDisplayed();
        return addToCartButtonIsDisplayed;
    }

    public void selectProductFilter(String element){
        Select selectObject = new Select(productFilter);
        selectObject.selectByVisibleText(element);

    }

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
    public List<String> getAllItemNames(){
        List<String> names= new ArrayList<>();

        for (WebElement itemName: itemNamesLabel) {
            String itemNameText = itemName.getText();
            StringBuilder sb = new StringBuilder(itemNameText);
            //sb.deleteCharAt(0);
            names.add(sb.toString());
        }
        return names;
    }
}
