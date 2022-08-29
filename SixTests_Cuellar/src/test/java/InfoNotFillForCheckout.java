import org.junit.Assert;
import org.junit.Test;
import pages.CartPage;
import pages.Homepage;
import pages.InfoPage;
import pages.LoginPage;
import utilities.DriverManager;

public class InfoNotFillForCheckout extends Base{
    @Test
    public void InfoNotFilled(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        Homepage homepage= new Homepage(DriverManager.getDriver().driver);
        homepage.clickBikeLightItem();
        homepage.clickOnAddBikeLightToCartButton();
        homepage.clickOnCart();
        CartPage cartpage = new CartPage(DriverManager.getDriver().driver);
        cartpage.ClickCheckoutButton();
        InfoPage infopage = new InfoPage(DriverManager.getDriver().driver);
        infopage.setFirstNameTextBox("");
        infopage.setLastNameTextBox("");
        infopage.setPostalCodeTextBoxTextBox("");
        infopage.ClickContinueButton();
        Assert.assertEquals("Error: First Name is required",infopage.getInfoFillErrorMessage());
    }
}
