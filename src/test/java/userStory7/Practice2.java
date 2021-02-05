package userStory7;

import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class Practice2 {

    public static void main(String[] args) {


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

        driver.findElement(By.className("unified-search__form-input")).sendKeys("mail" +Keys.ENTER);
        driver.findElement(By.className("unified-search__result-icon unified-search__result-icon--no-preview icon-confirm")).click();
    }
}
