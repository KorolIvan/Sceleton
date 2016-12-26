package Solutions.Boost.DataInformation;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * Created by Ivan on 16.12.2016.
 */

/* этот клас с методом вытягивают информацию с файла конфигуратионм в папен ресоурс*/
public class ConfigurationProperties {
    private static Properties PROPERTIES;
    private static String key;

    static {
        PROPERTIES = new Properties();
        URL props = ClassLoader.getSystemResource("Configuration.properties");
        try {
            PROPERTIES.load(props.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperties(String key){
        return PROPERTIES.getProperty(key);
    }

    /*public static boolean getBoolProperty(String key){

        if (PROPERTIES.getProperty(key).equals("true")) {
            return true;
        }
        else return false;
    }*/

}

