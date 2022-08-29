package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfoPage {
    WebDriver driver;
    @FindBy(id = "first-name")
    WebElement FirstNameTextBox;
    @FindBy(id = "last-name")
    WebElement LastNameTextBox;
    @FindBy(id = "postal-code")
    WebElement PostalCodeTextBox;
    @FindBy(id = "continue")
    WebElement ContinueButton;
    @FindBy(tagName = "h3")
    WebElement InfoFillError;
    public InfoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setFirstNameTextBox(String firstName){
        FirstNameTextBox.sendKeys(firstName);
    }
    public void setLastNameTextBox(String lastName){
        LastNameTextBox.sendKeys(lastName);
    }
    public void setPostalCodeTextBoxTextBox(String code){
        PostalCodeTextBox.sendKeys(code);
    }
    public void ClickContinueButton(){ContinueButton.click();}
    public String getInfoFillErrorMessage(){
        String errorMessage = InfoFillError.getText();
        return errorMessage;
    }
}
