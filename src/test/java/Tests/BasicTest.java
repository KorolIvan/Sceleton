package Tests;

import Solutions.Boost.DataInformation.ConfigurationProperties;
import Solutions.Boost.DataInformation.NewUserData;
import Solutions.Boost.DataInformation.UserData;
import Solutions.Boost.Pages.HomePage.HomePage;
import Solutions.Boost.Pages.SignUpNewUser.SignUpNewUser;
import Solutions.Boost.Pages.SingInPage.SingIn;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

/**
 * Created by Ivan on 16.12.2016.
 */

//создаются объекты всех созданых класов для проверки
public class BasicTest{
    //здесь создаються все переменные класов которые потом будут использоваться в тестах
    protected HomePage homePage;
    protected SignUpNewUser signUpNewUser;
    protected SingIn singIn;

    //создаем нового юзера и по требованию конструктора
    // вписываем все стринги которые необходимы
    protected NewUserData newUserData =
            new NewUserData(
                    ConfigurationProperties.getProperties("newUser.Email(valid)"),
                    ConfigurationProperties.getProperties("newUser.password(valid)"),
                    ConfigurationProperties.getProperties("newUser.firstName(valid)"),
                    ConfigurationProperties.getProperties("newUser.lastName(valid)")
                    );

    protected UserData userData = new UserData(
                    ConfigurationProperties.getProperties("user.email(valid)"),
                    ConfigurationProperties.getProperties("user.password(valid)")
                    );
    File pathBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
    FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
    FirefoxProfile firefoxProfile = new FirefoxProfile();

    protected ThreadLocal<WebDriver> threadLocal;
    //начало теста где будут инициалезированы все объекты и выделена для них память
    @Before
    public void setUp(){
        threadLocal = new ThreadLocal<WebDriver>();
        threadLocal.set(new FirefoxDriver(firefoxBinary, firefoxProfile));//принимает в сетя драйвер ФФ для работы
        homePage = new HomePage(getWebDriver());
        signUpNewUser = new SignUpNewUser(getWebDriver());
        singIn = new SingIn(getWebDriver());

    }
    //конец теста
    @After
    public void tearDown(){
        if(threadLocal!=null) {
            //driver = threadLocal;
            threadLocal.get().close();
            threadLocal.get().quit();
        }
    }
    //вносим вэб драйвер в переменую триэд локал для дальнейшего использования
    protected WebDriver getWebDriver(){
        return threadLocal.get();
    }
}
