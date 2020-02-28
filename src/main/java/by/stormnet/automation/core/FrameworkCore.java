package by.stormnet.automation.core;

import by.stormnet.automation.core.utils.BrowserConstants;
import by.stormnet.automation.core.utils.IOUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameworkCore {
    private static WebDriver webDriver;
    private static String browser = IOUtils.loadGenericProperties("browser", "configuration");
    public static String baseUrl = IOUtils.loadGenericProperties("baseUrl", "configuration");
    public static String baseUrl1 = IOUtils.loadGenericProperties("baseUrl1", "configuration");
    public static String baseUrl2 = IOUtils.loadGenericProperties("baseUrl2", "configuration");
    public static String baseUrl3 = IOUtils.loadGenericProperties("baseUrl3", "configuration");
    public static String baseUrl4 = IOUtils.loadGenericProperties("baseUrl4", "configuration");
    public static String baseUrl5 = IOUtils.loadGenericProperties("baseUrl5", "configuration");
    public static String baseUrl6 = IOUtils.loadGenericProperties("baseUrl6", "configuration");
    public static String baseUrl7 = IOUtils.loadGenericProperties("baseUrl7", "configuration");
    public static String baseUrl8 = IOUtils.loadGenericProperties("baseUrl8", "configuration");
    public static String baseUrl9 = IOUtils.loadGenericProperties("baseUrl9", "configuration");
    public static String baseUrl10 = IOUtils.loadGenericProperties("baseUrl10", "configuration");
    public static String baseUrl11 = IOUtils.loadGenericProperties("baseUrl11", "configuration");
    public static String baseUrl12 = IOUtils.loadGenericProperties("baseUrl12", "configuration");
    public static String baseUrl13 = IOUtils.loadGenericProperties("baseUrl13", "configuration");
    public static String baseUrl14 = IOUtils.loadGenericProperties("baseUrl14", "configuration");

    public static WebDriver getInstance() {
        if (browser.equals(BrowserConstants.CHROME)) {
            webDriver = new ChromeDriver();
        } else {
            if (browser.equals(BrowserConstants.FIREFOX)) {
                webDriver = new FirefoxDriver();
            } else {
                throw new IllegalArgumentException("Browser value from property file is incorrect!");
            }
        }
        return webDriver;
    }
}
