import com.google.common.collect.Ordering;
import org.junit.Assert;
import org.junit.Test;
import pages.Homepage;
import pages.LoginPage;
import utilities.DriverManager;

import java.util.List;

public class ThreeOrderOfProducts extends Base{
    @Test
    public void verifyHighToLowPriceItemsFilterTest() {
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        Homepage homepage= new Homepage(DriverManager.getDriver().driver);
        homepage.selectProductFilter("Price (high to low)");
        List<Double> prices = homepage.getAllItemPrices();
        boolean pricesAreSorted = Ordering.natural().reverse().isOrdered(prices);
        Assert.assertTrue(pricesAreSorted);
    }
    @Test
    public void verifyAtoZPriceItemsFilterTest() {
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        Homepage homepage= new Homepage(DriverManager.getDriver().driver);
        homepage.selectProductFilter("Name (A to Z)");
        List<String> names = homepage.getAllItemNames();
        boolean namesAreSorted = Ordering.natural().isOrdered(names);
        Assert.assertTrue(namesAreSorted);
    }
    @Test
    public void verifyZtoAPriceItemsFilterTest() {
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        Homepage homepage= new Homepage(DriverManager.getDriver().driver);
        homepage.selectProductFilter("Name (Z to A)");
        List<String> names = homepage.getAllItemNames();
        boolean namesAreSorted = Ordering.natural().reverse().isOrdered(names);
        Assert.assertTrue(namesAreSorted);
        System.out.println(names);
    }
}
