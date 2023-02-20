package HWcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static hillel.config.BaseClass.driver;

public class MainPageCuc {
    @FindBy(xpath = "//button[contains(@class, \"site-nav-link\") and contains(text(), \"Школа\")]")
    public WebElement school;

    @FindBy(xpath = "//button[contains(@class, \"site-nav-link\") and contains(text(), \"Курси\")]")
    public WebElement courses;

    @FindBy(xpath = "//a[contains(@class,\"site-nav-link\") and contains(text(),\"Працевлаштування\")]")
    public WebElement employment;

    @FindBy(xpath = "//a[contains(@class,\"site-nav-link\") and contains(text(),\"Блог\")]")
    public WebElement blog;

    @FindBy(xpath = "//a[contains(@class,\"site-nav-link\") and contains(text(),\"Контакти\")]")
    public WebElement contacts;

    public MainPageCuc(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getschool() {
        return school.getText();
    }

    public String getcourse(){
        return courses.getText();
    }

    public String getemployments() {
        return this.employment.getText();
    }
    public String getblog(){
        return blog.getText();
    }


    public String getcontacts()  {
        return contacts.getText();
    }

}
