package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserUtility;

import java.net.MalformedURLException;
import java.net.URL;


/*
 *
 * Navigation is an inner interface of WebDriver interface
 *
 * public interface WebDriver{
 * 		void close();
 * 		void quit();
 *
 * 		Navigation navigate();
 *
 *
 * 		interface Navigation{
 * 			void back();
 * 			void refresh();
 * 		}
 * }
 *
 * WebDriver driver = new ChromeDriver();
 * Navigation nav = driver.navigate();
 * nav.back();
 * nav.refresh(); or
 * driver.navigate().refresh();
 *
 * Navigation interface methods:
 *
 * 1. to(String url): is used to navigate to a given url as a String.
 *
 * 2. to(URL url): is used to navigate to a given url as a URL class object.
 *
 * 3. back(): is used to automate the back button of the browser
 *
 * 4. forward(): is used to automate the forward button of the browser
 *
 * 5. refresh(): is used to refresh the current browser window (automates the refresh button)
 *
 *
 */


public class NavigationMethods {
    public static void main(String[] args) throws InterruptedException{
        // launch browser
        BrowserUtility.setDriverPath("chromedriver");
        WebDriver driver = new ChromeDriver();


        // create an object reference of the Navigation interface
        Navigation nav = driver.navigate();

        // to(String url)
        nav.to("http://www.google.com");
        Thread.sleep(3000);


        // to(URL url)
        try {
            URL url = new URL("http://www.gmail.com");
            nav.to(url);
        } catch (MalformedURLException e) {
            System.out.println("url is not in proper format");
        }
        Thread.sleep(3000);

        // back()
        nav.back();
        Thread.sleep(3000);

        // forward()
        nav.forward();
        Thread.sleep(3000);

        // refresh()
        nav.refresh();
//        driver.navigate().refresh();
        Thread.sleep(3000);

        // close browser
        driver.close();

    }

}
