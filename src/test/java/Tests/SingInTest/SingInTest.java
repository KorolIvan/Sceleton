package Tests.SingInTest;

import Tests.BasicTest;
import org.junit.Test;

/**
 * Created by Ivan on 26.12.2016.
 */
public class SingInTest extends BasicTest {

    @Test
    public void SingInTest(){
        if (singIn != null) {
            singIn.fillUserFields(userData);
        }else{
            System.out.println("fail");
        }
    }

}
