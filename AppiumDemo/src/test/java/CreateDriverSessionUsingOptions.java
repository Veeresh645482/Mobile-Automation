import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class CreateDriverSessionUsingOptions
{
    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options().
                setDeviceName("pixel_8").
                setAutomationName("UiAutomator2").
                setPlatformName("Android").
                setApp("C:/Users/My Laptop/OneDrive/Desktop/Veeresh/Appium/Android App/ApiDemos-debug.apk");

        URL url = new URI("http://127.0.0.1:4723/").toURL();

        AppiumDriver driver = new AppiumDriver(url, options);

<<<<<<< HEAD
            WebElement ele = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
=======
        WebElement ele = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
>>>>>>> origin/main
        System.out.print(ele.getText());
    }
}
