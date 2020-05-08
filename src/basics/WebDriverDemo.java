package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.BrowserUtility;

/*
WebDriver is an interface in Selenium. this is the main interface.
This interface is implemented by RemoteWebDriver class and ChromeDriver, FirefoxDriver, SafariDriver,
EdgeDriver, InternetExplorerDriver, OperaDriver ..etc all are child classes of RemoteWebDriver class.

To launch any browser we have to create an object of BrowserDriver class and we can give an object
reference to the parent class i.e. RemoteWebDriver class or interface i.e WebDriver.

If we are given object reference to the interface WebDriver then we are achieving abstraction,
and we can use same object reference to launch any browser and to automate it.

 */
public class WebDriverDemo {

    public static void main(String[] args) throws InterruptedException {

        // launch the chrome browser
//        System.setProperty("webdriver.chrome.driver", "/Users/suryaprakash/Documents/softwares/chromedriver");
        BrowserUtility.setDriverPath("chromedriver");
        WebDriver driver = new ChromeDriver();
        // navigate to a google url
        driver.get("http://www.google.com");
        Thread.sleep(5000);
        // close chrome browser
        driver.close();

        // launch firefox browser
//        System.setProperty("webdriver.gecko.driver", "/Users/suryaprakash/Documents/softwares/geckodriver");
        BrowserUtility.setDriverPath("geckodriver");
        driver = new FirefoxDriver();
        // navigate to facebook url
        driver.get("http://www.facebook.com");
        Thread.sleep(5000);
        // close firefox browser
        driver.close();
    }

}
