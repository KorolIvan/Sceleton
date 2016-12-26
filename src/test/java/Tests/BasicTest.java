package Tests;

import Solutions.Boost.DataInformation.ConfigurationProperties;
import Solutions.Boost.DataInformation.NewUserData;
import Solutions.Boost.Pages.HomePage.HomePage;
import Solutions.Boost.Pages.SignUpNewUser.SignUpNewUser;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Ivan on 16.12.2016.
 */

//создаются объекты всех созданых класов для проверки
public class BasicTest{
    //здесь создаються все переменные класов которые потом будут использоваться в тестах
    protected HomePage homePage;
    protected SignUpNewUser signUpNewUser;

    //создаем нового юзера и по требованию конструктора
    // вписываем все стринги которые необходимы
    protected NewUserData newUserData =
            new NewUserData(
                    ConfigurationProperties.getProperties("newUser.Email(valid)"),
                    ConfigurationProperties.getProperties("newUser.password(valid)"),
                    ConfigurationProperties.getProperties("newUser.firstName(valid)"),
                    ConfigurationProperties.getProperties("newUser.lastName(valid)")
                    );

    protected ThreadLocal<WebDriver> threadLocal;
    //начало теста где будут инициалезированы все объекты и выделена для них память
    @Before
    public void setUp(){
        threadLocal = new ThreadLocal<WebDriver>();
        threadLocal.set(new FirefoxDriver());//принимает в сетя драйвер ФФ для работы
        homePage = new HomePage(getWebDriver());
        signUpNewUser = new SignUpNewUser(getWebDriver());

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
