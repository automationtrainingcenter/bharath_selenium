package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
To open any browser using selenium create an object of [Browser]Driver class
Browser - Chrome, Firefox, Safari, Opera, InternetExplorer, Edge

to launch chrome browser create an object of ChromeDriver class
ChromeDriver cdriver = new ChromeDriver();

to launch firefox browser create an object of FirefoxDriver class
FirefoxDriver fdriver = new FirefoxDriver();

 */
public class BrowserLaunch {

    public static void main(String[] args) {
        // set the system property with chromedriver executable file path
        System.setProperty("webdriver.chrome.driver", "/Users/suryaprakash/Documents/softwares/chromedriver");
        // open chrome browser
        ChromeDriver cdriver = new ChromeDriver();

        // set the system property with geckodriver executable file path
        System.setProperty("webdriver.gecko.driver", "/Users/suryaprakash/Documents/softwares/geckodriver");
        // open firefox browser
        FirefoxDriver fdriver = new FirefoxDriver();
    }

}
