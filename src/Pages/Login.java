package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by laxmikant on 18/05/2017.
 */
public class Login {

    WebDriver driver;

    @FindBy(xpath = "//td/table/tbody/tr[2]/td[1]/img")
    WebElement Logo;

    @FindBy(xpath = ".//*[@id='txtUsername']")
    WebElement LoginF;

    @FindBy(xpath = ".//*[@id='txtPassword']")
    WebElement passF;

    @FindBy(xpath = ".//*[@id='btnLogin']")
    WebElement loginBtn;

    public Login (WebDriver driver)
    { this.driver=driver;
        PageFactory.initElements(driver,this);
        if(!Logo.isDisplayed())
            throw  new IllegalStateException("This is not login page");
    }

    public WebElement getLogo()
    {
        return Logo;
    }

    public void setLoginF(String UserNm)
    {
        LoginF.sendKeys(UserNm);
    }

    public void  setpassF(String passF1)
    {
        passF.sendKeys(passF1);
    }

    public  void ClickLoginBtn()
    {
        loginBtn.click();
    }
}
