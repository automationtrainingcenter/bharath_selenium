package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserUtility;

/*
 * Window interface methods or Browser management
 *
 * public interface WebDriver{
 * 		void close();
 * 		void quit();
 *
 * 		Options manage();
 *
 *
 * 		interface Options{
 *
 *			Window window();
 *
 * 		}
 *
 * 		interface Window{
 *
 * 			void maximize();
 * 			void fullScreen();
 *
 * 		}
 * }
 *
 *
 * WebDriver driver = new ChromeDriver();
 * Options opt = driver.manage();
 * Window win = opt.window();
 * win.maximize();
 *
 *
 * driver.manage().window().maximize(); // object chaining
 *
 *
 * 1. maximize(): is used to maximize the browser window
 * 2. fullScreen(): is used to full screen mode(F11 mode) the browser window.
 * 3. getSize(): is used to retrieve the size of the browser window as a Dimension class object
 * 	  Note: Dimension class contains getWidth() and getHeight() which will return width and height as integers
 * 4. getPosition(): is used to retrieve the position of the browser window from top left corner the screen
 * as a Point class object
 * 	  Note: Point class contains getX() and getY() methods which will return x and y coordinate values of the
 * 		browser window
 * 5. setSize(Dimension arg): is used to set the browser width and height to the given width and height using
 * Dimension class object
 * 6. setPostion(Point arg): is used to set the position of the browser window from the top left corner using
 * Point class object
 *
 */
public class BrowserManagementMethods {

    public static void main(String[] args) throws InterruptedException {
        // launch the browser
        BrowserUtility.setDriverPath("chromedriver");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);

        // create object reference of Window interface
        Options opt = driver.manage();
        Window window = opt.window();


        // getSize(): returns size of the browser window as a Dimension class object
        Dimension size = window.getSize();
        System.out.println("width :: " + size.getWidth() + " height :: " + size.getHeight());

        // getPosition(): returns position of the browser window from the top left corner as a Point class object
        Point position = window.getPosition();
        System.out.println("x :: " + position.getX() + " and y :: " + position.getY());

        // maximize(): maximizes the browser
        window.maximize();
        Thread.sleep(5000);
//        driver.manage().window().maximize();

        // fullScreen(): full screen mode (F11 mode) of the browser window
        window.fullscreen();
        Thread.sleep(5000);

        // setSize(Dimension dim): set the browser window to a specified size
        Dimension dim = new Dimension(500, 350);
        window.setSize(dim);
//        window.setSize(new Dimension(500, 350));
        Thread.sleep(5000);

        // setPosition(Point pos): set the browser window to a specified position
        Point pos = new Point(300, 200);
        window.setPosition(pos);
        Thread.sleep(5000);


        // close browser
        driver.close();


    }

}
