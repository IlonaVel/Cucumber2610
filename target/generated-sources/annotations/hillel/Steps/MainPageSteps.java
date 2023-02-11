//package hillel.Steps;
//
//import hillel.config.BaseClass;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import org.junit.Assert;
//import pageObjects.MainPage;
//
//public class MainPageSteps extends BaseClass {
//    MainPage mainPage = new MainPage(getDriver());
//    @And("click button consultation")
//    public void clickButtonConsultation() {
//        mainPage.consultationButton.click();
//    }
//
//    @Then("Check open consultation {string}")
//    public void checkOpenConsultation(String str) throws InterruptedException {
//        Thread.sleep(2000);
//        Assert.assertEquals(mainPage.titleForm.getText(), str);
//    }
//
//}
//
