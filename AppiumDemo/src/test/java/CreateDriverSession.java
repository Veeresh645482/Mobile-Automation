import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class CreateDriverSession
{
    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appium:platformName", "Android");
        caps.setCapability("appium:deviceName", "pixel_8");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:udid", "emulator-5554");
        caps.setCapability("appium:app", "C:/Users/My Laptop/OneDrive/Desktop/Veeresh/Appium/And App/ApiDemos-debug.apk");

        URL url = new URI("http://127.0.0.1:4723/").toURL();

        AppiumDriver driver = new AppiumDriver(url, caps);

        WebElement ele = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
        System.out.print(ele.getText());

    }
}
