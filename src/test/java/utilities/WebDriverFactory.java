package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {



    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();                        // Chrome browser
            return new ChromeDriver();
        } else if ((browserType.equalsIgnoreCase("firefox"))) {
            WebDriverManager.firefoxdriver().setup();                       // Firefox browser
            return new FirefoxDriver();
        } else if ((browserType.equalsIgnoreCase("opera"))) {
            WebDriverManager.operadriver().setup();                         // Opera browse
            return new OperaDriver();
        } else if ((browserType.equalsIgnoreCase("edge"))) {
            WebDriverManager.edgedriver().setup();                          // Edge browser
            return new EdgeDriver();
        }else {
            System.out.println("Given browser type does not exist. Driver = null!");
            return null;
        }
    }


}
