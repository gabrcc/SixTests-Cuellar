import org.junit.Assert;
import org.junit.Test;
import pages.*;
import utilities.DriverManager;

public class CheckoutOverview extends Base{
    @Test
    public void VerifyCorrectProductArrivesToCheckoutOverview(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        Homepage homepage= new Homepage(DriverManager.getDriver().driver);
        homepage.clickOnAddSauceLabsBackPackToCartButton();
        homepage.clickOnCart();
        CartPage cartpage = new CartPage(DriverManager.getDriver().driver);
        cartpage.ClickCheckoutButton();
        InfoPage infopage = new InfoPage(DriverManager.getDriver().driver);
        infopage.setFirstNameTextBox("Andy");
        infopage.setLastNameTextBox("Lopez");
        infopage.setPostalCodeTextBoxTextBox("0000");
        infopage.ClickContinueButton();
        OverviewPage overviewpage = new OverviewPage(DriverManager.getDriver().driver);
        Assert.assertTrue(overviewpage.CheckSauceLabsBackpackArrivedToOverview());
    }
}
