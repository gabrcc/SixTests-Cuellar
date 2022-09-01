package stepDefinitions;

import com.google.common.collect.Ordering;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Homepage;
import pages.LoginPage;
import utilities.DriverManager;

import java.util.List;

public class OrderSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
    Homepage homepage = new Homepage(DriverManager.getDriver().driver);

    @Given("I set the user name with {string}")
    public void setUserName(String userName){
        loginPage.setUserNameTextBox(userName);
    }

    @And("I set the password with {string}")
    public void setUserPassword(String password){
        loginPage.setPasswordTextBox(password);
    }

    @When("Click on login button")
    public void clickOnLoginButton(){
        loginPage.clickOnLoginButton();
    }

    @Then("I click on the low to high order filter")
    public void clickOnFilterLowToHighOrder(){
        homepage.selectProductFilter("Price (low to high)");}
    @And("The products must be ordered with that filter")
    public void ProductsOrdered(){
        List<Double> prices = homepage.getAllItemPrices();
        boolean pricesAreSorted = Ordering.natural().isOrdered(prices);
        Assert.assertTrue(pricesAreSorted);
    }
}
