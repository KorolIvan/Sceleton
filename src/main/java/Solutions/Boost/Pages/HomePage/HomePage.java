package Solutions.Boost.Pages.HomePage;

import Solutions.Boost.DataInformation.ConfigurationProperties;
import Solutions.Boost.Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Иван on 17.12.2016.
 */
//клас для проверки запуска страници
public class HomePage extends MainPage{
//конструктор который принимает в себя драйвер
//будет вписываться при создании объекта в базиктест
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    //переоприделенный метод который открывает сайт
    @Override
    public void open() {
        driver.get(ConfigurationProperties.getProperties("site.url"));
        //driver.get("http://crystal-boutique.com.ua");
    }
    //непосредственно метод который будет вписыватья при обявлении теста
    public void loadPage(){
        System.out.println("Open home page test");
        open();
        System.out.println("Step 1: site is opened");
        //sleepSecond(10);
        takeScreenShot("Tests.HomePage.png");
    }
}
