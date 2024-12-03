import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class LocatorsDemo
{
    public static void main(String[] args) throws URISyntaxException, MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options().
                setDeviceName("pixel_8").
                setAutomationName("UiAutomator2").
                setPlatformName("Android").
                setApp("C:/Users/My Laptop/OneDrive/Desktop/Veeresh/Appium/Android App/ApiDemos-debug.apk");

        URL url = new URI("http://127.0.0.1:4723/").toURL();

        AppiumDriver driver = new AppiumDriver(url, options);

        //Locators
//        WebElement ele1 = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
//        System.out.println(ele1.getText());
//
//        WebElement ele2 = (WebElement) driver.findElements(AppiumBy.id("android:id/text1")).get(3);
//        System.out.println(ele2.getText());

        //UiAutomator
//        WebElement ele = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"App\")"));
//        System.out.println(ele.getText());

        //Swipe
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
        
        WebElement ele = driver.findElement(AppiumBy.xpath("//*[@resource-id='io.appium.android.apis:id/gallery']/android.widget.ImageView[1]"));

        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
//                "left", 100, "top", 100, "width", 200, "height", 200,
                "elementId", ((RemoteWebElement) ele).getId(),
                "direction", "left",
                "percent", 0.50
        ));
        


    }
}
