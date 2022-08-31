import org.junit.Assert;
import org.junit.Test;
import pages.CartPage;
import pages.Homepage;
import pages.LoginPage;
import utilities.DriverManager;

public class Examen extends Base{
    @Test
    public void verifyCartButtonNumberIsAdded(){
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        Homepage homepage= new Homepage(DriverManager.getDriver().driver);
        homepage.clickOnAddBikeLightToCartButton();
        homepage.clickOnAddSauceLabsBackPackToCartButton();
        homepage.clickOnCartIcon();
        CartPage cartpage = new CartPage(DriverManager.getDriver().driver);
        Assert.assertTrue( cartpage.BikeLightDisplayedOnCart());
        Assert.assertTrue( cartpage.BackPackDisplayedOnCart());

        Assert.assertEquals( "2", cartpage.getCartIconText());
        cartpage.clickOnRemoveSauceLabsBackPackToCartButton();
        cartpage.clickOnRemoveBikeLightButton();
        try{

            Assert.assertFalse(cartpage.CartEmpty());
        }catch (Exception e){}
        Assert.assertEquals( "", cartpage.getCartIconText());


    }

}
