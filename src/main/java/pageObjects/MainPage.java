package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy (id = "btn-consultation-hero")
    public WebElement consultationButton;
    @FindBy (className = "form_title")
    public WebElement titleForm;

    public  MainPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
