package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {
    WebDriver driver;

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    WebElement Backpack;

    public OverviewPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public boolean CheckSauceLabsBackpackArrivedToOverview(){
        boolean arrival = Backpack.isDisplayed();
        return arrival;
    }
}
