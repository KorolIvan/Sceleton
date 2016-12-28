package Solutions.Boost.DataInformation;

/**
 * Created by Ivan on 18.12.2016.
 */
public class AddressData {
    public String email;
    public String password;
    public String firstName;
    public String lastName;
    public String address;
    public String zipCode;
    public String city;
    public String phone;
    public String company;

    public AddressData(String email,
                       String password,
                       String firstName,
                       String lastName,
                       String address,
                       String zipCode,
                       String city,
                       String phone,
                       String company){
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.phone = phone;
        this.company = company;
    }
}
