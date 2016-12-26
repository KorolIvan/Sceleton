package Solutions.Boost.Pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ivan on 16.12.2016.
 */
// создаются методы при вызове которых булут исполняться какие то действия
public abstract class MainPage {
    public WebDriver driver;
    private WebDriverWait wait;


    //конструктор принимает в себя драйвер силениума
    public MainPage(WebDriver driver){
        this.driver = driver;

        wait = new WebDriverWait(this.driver, 30);

        PageFactory.initElements(this.driver, this);
    }
    //абстрактный метод который будет переопределяться и будет вписываться сайт
    //с конфигурационного файла который надо открыть
    public abstract void open();

    //введение данных по вэб элементу и данных с конфигурации
    public void type(WebElement element, String txt){
        element.clear();
        element.sendKeys(txt);
    }

    //метод который снимает скриншоты и мохроняет в папке при этом имя оприделяется
    // при вызове этого метода
    public final void takeScreenShot (String fileName){

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            org.apache.commons.io.FileUtils.copyFile(src, new File("./Results/"+fileName) );
            System.out.println("Screenshot is taken");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //метод который вызывает слип
    public void sleepSecond(int second){
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
