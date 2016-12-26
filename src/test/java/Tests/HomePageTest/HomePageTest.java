package Tests.HomePageTest;

import Tests.BasicTest;
import org.junit.Test;

/**
 * Created by Ivan on 17.12.2016.
 */

//создаем клас для теста главной слтраници и наследуем
// от базового класа где уже сужествует созданный объект этого класа
public class HomePageTest  extends BasicTest{

   //непосредственно тест
    @Test
    public void openHomePage(){
        if(homePage!=null) {
            this.homePage.loadPage();
        }else{
            System.out.println("fail");
        }
    }
}
