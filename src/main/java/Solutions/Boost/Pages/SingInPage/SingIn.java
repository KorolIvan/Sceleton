package Solutions.Boost.Pages.SingInPage;

import Solutions.Boost.DataInformation.ConfigurationProperties;
import Solutions.Boost.DataInformation.UserData;
import Solutions.Boost.Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ivan on 26.12.2016.
 */
public class SingIn extends MainPage {

    @FindBy(css = ".login")
    WebElement logInButton;

    @FindBy(css = "#email")
    WebElement emailField;

    @FindBy(css = "#passwd")
    WebElement passwordField;

    @FindBy(css = "#SubmitLogin")
    WebElement submitBut;

    public SingIn(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(ConfigurationProperties.getProperties("site.url"));
    }

    public void fillUserFields(UserData userData){
        System.out.println("SingIn like user");
        open();
        System.out.println("Step 1: site is opened");
        sleepSecond(3);

        logInButton.click();
        System.out.println("Step 2: Swich to login page");
        sleepSecond(3);
        takeScreenShot("loginPage1.png");


        type(emailField, userData.email);
        type(passwordField, userData.password);

        submitBut.click();
        sleepSecond(3);
        takeScreenShot("UserPage.png");
    }
}
