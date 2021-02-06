package userStory7;

import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TestCase_7 {


    WebDriver driver;

    @Test
    public void test1() {

            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("http://qa.trycloud.net/index.php/login?clear=1");
            driver.manage().window().maximize();

        WebElement userName= driver.findElement(By.xpath("//input[@id='user']"));
        userName.click();
        userName.sendKeys("User21");

        BrowserUtils.sleep(1);

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.click();
        password.sendKeys("Userpass123");

        BrowserUtils.sleep(1);

        WebElement loginButton= driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();

        WebElement Searchbar = driver.findElement(By.xpath("//div[@class='header-menu unified-search']"));
        Searchbar.click();

        String expectedresult=Searchbar.getAttribute("Search apps,files,comments,desk");
        String actuallresult=Searchbar.getText();

        Assert.assertEquals(expectedresult,actuallresult);

        /*driver.findElement(By.id("user")).sendKeys("User21");
        WebElement user = driver.findElement(By.xpath("//xfh"));
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit-wrapper")).click();
        driver.findElement(By.className("material-design-icon__svg")).click();
*/

//


    }






    }

/*
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();

    List<WebElement> listOflinks = driver.findElements(By.xpath("//body//a"));

        for(WebElement eachLink : listOflinks){

        System.out.println(eachLink.getText());
    }

    int numberoflinks=listOflinks.size();

        System.out.println("number of links" + numberoflinks);

        driver.close();
*/







