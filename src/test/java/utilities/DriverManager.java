package utilities;

/*Author - Omkar Palande
* This class will be used to initialize webdriver and to use for in the project classes*/

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver()
    {
        if(driver==null)
        {

            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
        }
        return driver;
    }

    public static void quitDriver()
    {
        if(driver!=null)
        {
            driver.quit();
            driver=null;
        }
    }


}
