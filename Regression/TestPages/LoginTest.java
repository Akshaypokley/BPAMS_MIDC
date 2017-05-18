package TestPages;

import Pages.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utilities.LoginFunction.LogFunction;
import static Utilities.OpenBrowser.GetUrl;
import static Utilities.OpenBrowser.openBrowser;

/**
 * Created by laxmikant on 18/05/2017.
 */
public class LoginTest {
WebDriver driver;
    @BeforeMethod
    public void loadbrowser()
    {
      driver= openBrowser("chrome");
      GetUrl("url");
    }

    @Test
    public void LoginTest()
    {
   LogFunction(driver);
    }
}
