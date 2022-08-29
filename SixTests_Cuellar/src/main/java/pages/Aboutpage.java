package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Aboutpage {
    WebDriver driver;

    @FindBy(id = "entry-7AF654nEu1m9nOyBscUT3a")
    WebElement ElementInAboutPage;

    public Aboutpage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Boolean ElementInAboutPageIsDisplayed(){
        boolean ElementInAboutPageIsDisplayed = ElementInAboutPage.isDisplayed();
        return ElementInAboutPageIsDisplayed;
    }
}
