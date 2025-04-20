package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.TextBoxPage;
import utilities.DriverManager;
import utilities.ExtentManager;

public class textBoxSteps {

    WebDriver driver;
    TextBoxPage textBoxPage;
    ExtentManager extentManager = new ExtentManager();


    @Given("user is on text box page")
    public void user_is_on_the_textbox_page() {

        driver = DriverManager.getDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
        textBoxPage = new TextBoxPage(driver);

        extentManager.extentCreateTest("Text Box Page");
        extentManager.extentTestLog(Status.PASS, "User is on Text Box Page");

    }

    @When("user clicks on Full Name and enters {string}")
    public void user_clicks_on_full_name_and_enters_value(String fullName) throws InterruptedException {
        textBoxPage.setFullName().click();
        textBoxPage.setFullName().clear();
        textBoxPage.setFullName().sendKeys(fullName);

        Thread.sleep(5000);
        extentManager.extentTestLog(Status.PASS,"User entered Full Name: " + fullName);

    }

    @And("user clicks on E-mail and enters {string}")
    public void user_clicks_on_email_and_enters_value(String email) throws InterruptedException {
        textBoxPage.setEmail().click();
        textBoxPage.setEmail().clear();
        textBoxPage.setEmail().sendKeys(email);
        Thread.sleep(5000);
        extentManager.extentTestLog(Status.PASS,"User entered Email: " + email);
    }

    @And("user enters current address {string}")
    public void user_enters_current_address(String address) throws InterruptedException {
        textBoxPage.setAddress().click();
        textBoxPage.setAddress().clear();
        textBoxPage.setAddress().sendKeys(address);
        Thread.sleep(5000);
        extentManager.extentTestLog(Status.PASS,"User entered Address: " + address);
    }

    @And("user enters password {string}")
    public void user_enters_password(String password) throws InterruptedException {
        textBoxPage.setPassword().click();
        textBoxPage.setPassword().clear();
        textBoxPage.setPassword().sendKeys(password);
        Thread.sleep(5000);
        extentManager.extentTestLog(Status.PASS,"User entered Password: " + password);
    }

    @And("user clicks on Submit button")
    public void user_clicks_on_submit_button() throws InterruptedException {
        textBoxPage.clickSubmit().click();
        Thread.sleep(5000);
        extentManager.extentTestLog(Status.PASS,"User clicked on Submit button");
        extentManager.extentFlush();
    }


}
