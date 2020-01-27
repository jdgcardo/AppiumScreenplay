package co.com.qvision.eribank.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class MyDriver {
    private static final Logger logger = Logger.getLogger(MyDriver.class.getName());
    private static AppiumDriver<MobileElement> driver;
    static String envPlatform = "ANDROID";
    public static String plataforma = "ANDROID";

    public static AppiumDriver<MobileElement> abrirApp(){

        String url = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformVersion","10.0");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage","com.experitest.ExperiBank");
        capabilities.setCapability("appActivity", "com.experitest.ExperiBank.LoginActivity");
        capabilities.setCapability("noReset","true");

        try {
            driver = new AppiumDriver<MobileElement>(new URL(url),capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;

    }


}
