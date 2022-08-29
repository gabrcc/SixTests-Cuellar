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
    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void ClickCheckoutButton(){CheckoutButton.click();}

    public boolean BikeLightDisplayedOnCart(){
        boolean BikeLightDisplayedOnCart = BikeLight.isEnabled();
        return BikeLightDisplayedOnCart;
    }
    public boolean CheckoutButtonDisplayed(){
        boolean CheckoutDisplayed = CheckoutButton.isDisplayed();
        return CheckoutDisplayed;
    }
}
