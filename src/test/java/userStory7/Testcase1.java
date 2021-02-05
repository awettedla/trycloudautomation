package userStory7;

import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Testcase1 {


    WebDriver driver;

    @Test
    public void test1() {



        //open the crhrome browser
        driver = WebDriverFactory.getDriver("chrome");

        //2- go to  http://qa.trycloud.net/index.php/login?clear=1
        driver.get("http://qa2.trycloud.net/");

        //3-maximize the window
        driver.manage().window().maximize();

        //4- implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //5- user able to enter valid username
        WebElement userName = driver.findElement(By.xpath("//input[@id='user']"));
        userName.click();
        userName.sendKeys("User21");

        BrowserUtils.sleep(1);

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.click();
        password.sendKeys("Userpass123");

        BrowserUtils.sleep(1);

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();

        BrowserUtils.sleep(1);

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "http://qa2.trycloud.net/index.php/login";


    /*    if (actualUrl.equals(expectedUrl)){
            System.out.println("Url verifed");
        }else{
            System.out.println("Url verified Failed");
        }
*/

    }


    }
