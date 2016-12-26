package Solutions.Boost.DataInformation;

/**
 * Created by Ivan on 18.12.2016.
 */
public class NewUserData {
    public String email;
    public String password;
    public String firstName;
    public String lastName;


    public NewUserData(
                        String email,
                       String password,
                       String firstName,
                       String lastName
                      ){
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;

    }
}
