package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class BrowserUtils {
    // Create method name:  wait
    // Converting milliseconds to second
    // handle checked exception


    /**
     * Pause test for some time
     *
     * @param second
     */
    public static void sleep(int second) {
        second *= 1000l;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("Something is wrong in the sleep method.");
        }
    }


    //PRACTICE #4: Method: verifyOrder
    //• Create a method named verifyOrder in WebOrderUtils class.
    //• Method takes WebDriver object and String(name).
    //• Method should verify if given name exists in orders.
    //• This method should simply accepts a name(String), and assert whether
    //given name is in the list or not.
    //• Create a new TestNG test to test if the method is working as expected.

    public static void verifyOrder(WebDriver driver, String expectedName){

        //1- Create a locator that is returning us all of the lists in the table
        //table[@id='ctl00_MainContent_orderGrid']//tr//td[2]

        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[2]"));

        //we need to loop through 'allName' List of WebElement and make sure 'expectedName' is in there

        for (WebElement each : allNames) {

            if (each.getText().equals(expectedName)) {
                Assert.assertTrue(each.getText().equals(expectedName) );
                return;
            }

        }

        //The only condition where the Assert.fail() line below executed is if 'expectedName' is not in the list.

        //Assert.fail(); method will FAIL THE TEST NO MATTER WHAT.
        Assert.fail("The expectedName is not in the table. ");

}
}
