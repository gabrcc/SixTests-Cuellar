package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;
    @FindBy(id = "checkout")
    WebElement CheckoutButton;
    @FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
    WebElement BikeLight;
    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    WebElement BackPack;
    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;
    @FindBy(className = "cart_item_label")
    WebElement Label;

    @FindBy(id = "remove-sauce-labs-bike-light")
    WebElement BikeLightRemoveButton;
    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement sauceLabsBackPackRemoveToCartButton;

    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickOnRemoveSauceLabsBackPackToCartButton(){
        sauceLabsBackPackRemoveToCartButton.click();
    }
    public void clickOnRemoveBikeLightButton(){BikeLightRemoveButton.click();}
    public void ClickCheckoutButton(){CheckoutButton.click();}

    public boolean BikeLightDisplayedOnCart(){
        boolean BikeLightDisplayedOnCart = BikeLight.isEnabled();
        return BikeLightDisplayedOnCart;
    }
    public boolean CartEmpty(){
        boolean CartEmpty = Label.isDisplayed();
        return CartEmpty;
    }
    public boolean BackPackDisplayedOnCart(){
        boolean BackPackDisplayedOnCart = BackPack.isEnabled();
        return BackPackDisplayedOnCart;
    }
    public boolean CheckoutButtonDisplayed(){
        boolean CheckoutDisplayed = CheckoutButton.isDisplayed();
        return CheckoutDisplayed;
    }


    public String getCartIconText(){
        String cartText = cartIcon.getText();
        return cartText;
    }
}
