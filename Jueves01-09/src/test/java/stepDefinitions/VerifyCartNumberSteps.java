package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Homepage;
import pages.LoginPage;
import utilities.DriverManager;

public class VerifyCartNumberSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
    Homepage homepage = new Homepage(DriverManager.getDriver().driver);

    @Given("I  set the user name field with {string}")
    public void setUserName(String userName){
        loginPage.setUserNameTextBox(userName);
    }

    @And("I  set the password field with {string}")
    public void setUserPassword(String password){
        loginPage.setPasswordTextBox(password);
    }

    @When("I click on login  button")
    public void clickOnLoginButton(){
        loginPage.clickOnLoginButton();
    }

    @Then("I click Backpack add to cart button")
    public void clickAddBackpack(){homepage.clickOnAddSauceLabsBackPackToCartButton();}

    @And("Verify the cart number is 1")
    public void VerifyCartNumberIsOne(){Assert.assertEquals( "1", homepage.getCartIconText());}

    @Then("I click on Bike add to cart button")
    public void clickAddBikeLight(){homepage.clickOnAddSauceLabsBikeLightToCartButton();}

    @And("Verify the cart number is 2")
    public void VerifyCartNumberIsTwo(){Assert.assertEquals( "2", homepage.getCartIconText());}

}
