package HWcucumber;

import hillel.Config.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;
import java.util.Random;

import static java.sql.DriverManager.getDriver;

public class MainPageCucSteps1 extends BaseClass {
    MainPageCuc mainPageCuc=new MainPageCuc(getDriver());

    @When("I open the page {string}")
    public void iOpenThePage(String url) {
        getDriver().get(url);
    }


//    @Then("check1")
//    public void check1(DataTable dataTable) throws InterruptedException  {
//        List<Map<String,String>> mapList=dataTable.asMaps();
//        int a = 1 + (int) ( Math.random() * mapList.size()-1 );
//        Map<String,String> map=mapList.get(a);
//        Assert.assertEquals(mainPageCuc.getschool(), map.get("text"), map.get("result"));
//        Assert.assertEquals(mainPageCuc.getcourse(), map.get("text"), map.get("result"));
//        Assert.assertEquals(mainPageCuc.getemployments(), map.get("text"), map.get("result"));
//        Assert.assertEquals(mainPageCuc.getblog(), map.get("text"), map.get("result"));
//        Assert.assertEquals(mainPageCuc.getcontacts(), map.get("text"), map.get("result"));
       // Assert.assertEquals(mainPageCuc.getschool(), "школа", "result");
        //Assert.assertEquals(mainPageCuc.getcourse(), "курси", "result");
        //Assert.assertEquals(mainPageCuc.getemployments(), "працевлаштування", "result");
        //Assert.assertEquals(mainPageCuc.getblog(), "блог", "result");
       // Assert.assertEquals(mainPageCuc.getcontacts(), "контакти", "result");




    @Then("Check {string} with {string}")
    public void checkWith(String element, String text) throws InterruptedException {
        Assert.assertEquals(mainPageCuc.getschool(), "школа");
        Assert.assertEquals(mainPageCuc.getcourse(), "курси");
        Assert.assertEquals(mainPageCuc.getemployments(), "працевлаштування");
        Assert.assertEquals(mainPageCuc.getblog(), "блог");
        Assert.assertEquals(mainPageCuc.getcontacts(), "контакти");
        Thread.sleep(2000);
    }
}















