package Solutions.Boost.Pages.SignUpNewUser;

import Solutions.Boost.DataInformation.ConfigurationProperties;
import Solutions.Boost.DataInformation.NewUserData;
import Solutions.Boost.Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ivan on 18.12.2016.
 */
public class SignUpNewUser extends MainPage {

    @FindBy(css = ".login")
    WebElement logButton;

    @FindBy(css = "#email_create")
    WebElement emailFoCrwateField;

    @FindBy (css = "#SubmitCreate")
    WebElement submitButton;




    public SignUpNewUser(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {

        driver.get(ConfigurationProperties.getProperties("site.url"));
    }

    public void fillEmailField(NewUserData newUserData){
        //new HomePage(driver).loadPage();
        System.out.println("Create new user test");
        open();
        System.out.println("Step 1: site is opened");
        sleepSecond(3);

        logButton.click();
        System.out.println("Step 2: Swich to login page");
        takeScreenShot("loginPage.png");
        sleepSecond(3);
        //type(emailFoCrwateField, ConfigurationProperties.getProperties("newUser.Email(valid)"));
        type(emailFoCrwateField, newUserData.email);
        System.out.println("Step 3: fill the email field");
        submitButton.click();
        System.out.println("Step 4: new user page is opened");
        sleepSecond(3);
        takeScreenShot("newUserPage.png");
    }
}
