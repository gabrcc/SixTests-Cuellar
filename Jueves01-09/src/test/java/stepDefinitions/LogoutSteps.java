package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;
import pages.LoginPage;
import utilities.DriverManager;

public class LogoutSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
    Homepage homepage = new Homepage(DriverManager.getDriver().driver);

    @Given("I. set the user name field with {string}")
    public void setUserName(String userName){
        loginPage.setUserNameTextBox(userName);
    }

    @And("I. set the password field with {string}")
    public void setUserPassword(String password){
        loginPage.setPasswordTextBox(password);
    }

    @When("I. click on login button")
    public void clickOnLoginButton(){
        loginPage.clickOnLoginButton();
    }
    @And("I. click on menu icon")
    public void clickOnMenuIcon(){homepage.clickOnHamburguerButton();}
    @And("I. click on logout option")
    public void selectLogoutOption(){homepage.clickOnLogoutLink();}
    @Then("The. login page should be displayed")
    public void loginPageIsDisplayed(){loginPage.loginButtonIsDisplayed();}

}
