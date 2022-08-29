import org.junit.Assert;
import org.junit.Test;
import pages.CartPage;
import pages.Homepage;
import pages.LoginPage;
import utilities.DriverManager;

public class VerifyAddedProductShownInCart extends Base{
    @Test
    public void AddedSuccess(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        Homepage homepage= new Homepage(DriverManager.getDriver().driver);
        homepage.clickBikeLightItem();
        homepage.clickOnAddBikeLightToCartButton();
        homepage.clickOnCart();
        CartPage cartpage = new CartPage(DriverManager.getDriver().driver);
        Assert.assertTrue(cartpage.BikeLightDisplayedOnCart());
    }
}
