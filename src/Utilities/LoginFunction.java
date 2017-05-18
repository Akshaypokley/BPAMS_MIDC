package Utilities;

import Pages.Login;
import org.openqa.selenium.WebDriver;

/**
 * Created by laxmikant on 18/05/2017.
 */
public class LoginFunction {
    static WebDriver driver;

    public static void LogFunction(WebDriver driver)
    {

        Login login=new Login(driver);
        login.setLoginF("a@g.com");
        login.setpassF("Autodcr@1");
        login.ClickLoginBtn();


    }
}
