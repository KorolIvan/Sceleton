package Tests.SignUpTest;

import Tests.BasicTest;
import org.junit.Test;

/**
 * @author Ivan on 18.12.2016.
 */
public class SignUpTest extends BasicTest {
    @Test
    public void signUpNewUser(){
        if(signUpNewUser!=null) {
            this.signUpNewUser.fillEmailField(newUserData);
        }else{
            System.out.println("fail");
        }
    }
}
