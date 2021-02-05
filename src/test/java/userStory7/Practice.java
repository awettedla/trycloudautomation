package userStory7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class Practice {
    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("desktop-grid-1")).click();
        driver.findElement(By.className("nav-right")).click();

        /*driver.findElement(By.id("user")).sendKeys("User21");
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit-wrapper")).click();
        driver.findElement(By.className("material-design-icon__svg")).click();*/


    }
    }
