package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserUtility;

import java.util.List;

/*
By class methods or Locating Techniques of selenium

Note 1: To locate any elmenet in the webpage right click on that
element and click inspect, then that element will be highlighted
in the html source code
Note 2: Every html element is implemented using a tag and every
element contains multiple attributes with values
eg:
	<input id="fname"
	name = "firstName"
	class = "inputtext _58mg _2ph-"
	aria-label="Enter first name"
	aria-required = "true"></input>
Here <input ....> opening tag and </input> is closing tag.
id, name, class, aria-lable, aria-required are the attribute name
fname, firstName, inputtext _58mg _2ph- and true are the attribute values
Note 3: we can locate an element using any of the attribute and it's value

The following are the methods of By class as per the prioirty of locating
an element. All these methods are static methods so we can call them using
class name itself. All these methods accepts string arg and returns By class
reference

1. id(String arg) : returns a By class reference
it is used to locate an element using it's id attribute value.
2. name(String arg) : it is used to locate an element using it's name
attribute value.
Note: if an element contains a dynamic id or does not contains an id or
duplicate name attribute then we can't locate those elements using id
or name. so we have to use below techniques.
Dynamic ids are id attribute values which will change when ever we refresh
a web page.

If we are locating a link and that link does not contains unique id or name
attribute then we can locate those links using following techniques
3. linkText(String arg): is used to locate a link using link text
link text is the inner text of the <a> tag
inner text means the text in between opening and closing tag
linktext means the text in between <a> and </a>
4. partialLinkText(String arg): is used to locate a link using part of
the link text instead of complete link text

To locate any element other than links which does not contains unique id
or name attribute we can use following techniques
5. cssSelector(String arg): is used to locate any element using any
attribute value
syntax:
	"tagName[att_name = 'att_value']"

6. xpath(String arg): is also used to locate any element using any attribute
value
syntax:
	"//tagName[@att_name = 'att_value']"

The below two methods are generally used to locate multiple elements
7. className(String arg) : is used to locate either single or multiple elements using
class name of the element.

Note: there is a probability a class attribute can have multiple class names
eg: in above element class attribute value is class = "inputtext _58mg _2ph-"
in above class attribute value we have 3 classes and we have to use any one class name
in className() argument, we are not allowed to use multiple class names in
className() argument

	By.className("inputtext") is valid
	By.className("_58mg") is also valid
	By.className("_2ph-") is also valid
	By.className("inputtext _58mg _2ph-") is invalid because the argument contains three class names

8. tagName(String arg): is used to locate either single or multiple elements using
name of the tag.
 */
public class LocatingTechniques {

    public static void main(String[] args) {
        // launch browser
        BrowserUtility.setDriverPath("chromedriver");
        WebDriver driver = new ChromeDriver();
        // navigate to a url
        driver.get("http://www.facebook.com");
        // maximize the browser window
        driver.manage().window().maximize();


        // id(String idAttValue): locates an element using id attribute value
        By txtEmailId = By.id("email");
        WebElement txtEmail = driver.findElement(txtEmailId);
//        WebElement txtEmail = driver.findElement(By.id("email"));

        // name(String nameAttValue): locates an element using name attribute value
        By txtFNameName = By.name("firstname");
        WebElement txtFName = driver.findElement(txtFNameName);

        // linkText(String linkText): locates a link using it's inner text
        By lnkForgottenAccLinkText = By.linkText("Forgotten account?");
        WebElement lnkForgottenAcc = driver.findElement(lnkForgottenAccLinkText);

        // partialLinkText(String partOfTheLinkText): locates a link using part of it's inner text
        By lnkCookiePolicyParLnkTxt = By.partialLinkText("Cookie");
        WebElement lnkCookiePolicy = driver.findElement(lnkCookiePolicyParLnkTxt);

        // cssSelector(String cssSelector): locates an element using any attribute and it's value
        // syntax: tagName[attName = 'attValue']
        By rbtnFemaleCss = By.cssSelector("input[value='1']");
        WebElement rBtnFemale = driver.findElement(rbtnFemaleCss);

        // xpath(String xpath): locates an element using any attribute and it's value
        // syntax: //tagName[@attName = 'attValue']
        By rbtnMaleXpath = By.xpath("//input[@value='2']");
        WebElement rBtnMale = driver.findElement(rbtnMaleXpath);

        // className(String nameOfaClass): locates zero or more elements using name of class
        By inputtextClsName = By.className("inputtext");
        List<WebElement> txtInputs = driver.findElements(inputtextClsName);
        System.out.println("number of text boxes :: "+txtInputs.size());

        //tagName(String nameOfTag): locates zero or more elements using name of the tag
        By aTag = By.tagName("a");
        List<WebElement> links = driver.findElements(aTag);
        System.out.println("number of links :: "+links.size());

        // close brosers
        driver.close();
    }



}
