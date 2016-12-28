package Tests.TestsGroup;

import Tests.BasicTest;
import Tests.HomePageTest.HomePageTest;
import Tests.SignUpTest.SignUpTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.openqa.selenium.server.SpecialCommand.open;

/**
 * Created by Ivan on 19.12.2016.
 */
//этот тест будет тестировать сраницу логина
public class TestGroup1 extends BasicTest{

    @Test
    public void goFirstGroup(){
        try {
            this.homePage.loadPage();
            this.signUpNewUser.fillEmailField(newUserData);
            this.singIn.fillUserFields(userData);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
