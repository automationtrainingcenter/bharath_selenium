package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserUtility;

import java.util.List;
import java.util.Set;

public class WebDriverMethods {

    public static void main(String[] args) throws InterruptedException {
        // launch the browser
        BrowserUtility.setDriverPath("chromedriver");
        WebDriver driver = new ChromeDriver();

        // get(String url):  navigate to url we specified as a string argument
        driver.get("http://www.facebook.com");

        // getCurrentUrl(): returns String which is url of the current browser window
        String url = driver.getCurrentUrl();
        System.out.println("url of the page is :: " + url);

        // getTitle(): returns String which is title of the current web page
        String title = driver.getTitle();
        System.out.println("title is :: " + title);

        // getPageSource(): returns String which is entire source code of the web page
        String pageSource = driver.getPageSource();
        System.out.println("page source code contains 'Helpful tips to avoid COVID-19 online scams' :: " + pageSource.contains("Helpful tips to avoid COVID-19 online scams"));

        // getWindowHandle(): returns String which is a unique id of the current browser window
        String windowId = driver.getWindowHandle();
        System.out.println("current window id is :: " + windowId);

        // getWindowHandles(): returns Set<String> which is a unique ids of all the browser windows or tabs opened by driver instance
        Set<String> windowIDs = driver.getWindowHandles();
        System.out.println("all the windows ids :: " + windowIDs);

        /* findElement(By arg): is used to locate an element with in the current web page using
         * given locator information. This method returns a WebElement interface reference if element
         * located successfully with given locator information else
         * it returns NoSuchElementException.
         */
        By txtEmailLoc = By.id("email");
        WebElement txtEmail = driver.findElement(txtEmailLoc);
//        WebElement txtEmail = driver.findElement(By.id("email"));

        /* findElements(By arg): is used to locate one or more elements within the current web page
         * using given locator information. This method returns a List<WebElement> reference. With given
         * locator information if no element is located then this method will return a List of size 0.
         * It does not throw any exception.
         */
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("number of links in the page are :: "+links.size());

        Thread.sleep(3000);

        // close(): closes the current browser window
//        driver.close();

        // quit(): closes all the browser windows or tabs opened by the driver instance
        driver.quit();
    }


}
