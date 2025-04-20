package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {

    private WebDriver driver; //this is the private variable specific to each page

    // 1. Constructor
    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    // 2. Locators
    @FindBy(name = "fullname")
    WebElement fullName;

    @FindBy(xpath = "//input[@name='email']")
    WebElement inputemail;

    @FindBy(xpath="//textarea[@name='address']")
    WebElement address;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath = "//input[@value='Submit']")
    WebElement btnSubmit;

    // 3. Methods
    public WebElement setFullName() {
        return fullName;
    }
    public WebElement setEmail() {
        return inputemail;
    }
    public WebElement setAddress() {return address;}
    public WebElement setPassword() {return password;}
    public WebElement clickSubmit() {return btnSubmit;}

}
