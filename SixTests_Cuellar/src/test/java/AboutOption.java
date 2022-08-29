import org.junit.Assert;
import org.junit.Test;
import pages.Aboutpage;
import pages.Homepage;
import pages.LoginPage;
import utilities.DriverManager;

public class AboutOption extends Base{

    @Test
    public void verifyAboutOption()  {
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        loginPage.setUserNameTextBox("standard_user");
        loginPage.setPasswordTextBox("secret_sauce");
        loginPage.clickOnLoginButton();
        Homepage homepage= new Homepage(DriverManager.getDriver().driver);
        homepage.clickOnMenuLinesButton();
        homepage.clickOnAboutOption();
        Aboutpage aboutpage = new Aboutpage(DriverManager.getDriver().driver);
        Assert.assertTrue(aboutpage.ElementInAboutPageIsDisplayed());
    }
}
