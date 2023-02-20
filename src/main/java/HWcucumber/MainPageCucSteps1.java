package HWcucumber;

import hillel.config.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;
import java.util.Random;
public class MainPageCucSteps1 extends BaseClass {
    MainPageCuc mainPageCuc=new MainPageCuc(getDriver());

    @Then("check1")
    public void check1(DataTable dataTable) throws InterruptedException  {
        List<Map<String,String>> mapList=dataTable.asMaps();
        int a = 1 + (int) ( Math.random() * mapList.size()-1 );
        Map<String,String> map=mapList.get(a);
        Assert.assertEquals(mainPageCuc.getschool(), "школа", "result");
        Assert.assertEquals(mainPageCuc.getcourse(), "курси", "result");
        Assert.assertEquals(mainPageCuc.getemployments(), "працевлаштування", "result");
        Assert.assertEquals(mainPageCuc.getblog(), "блог", "result");
        Assert.assertEquals(mainPageCuc.getcontacts(), "контакти", "result");
        Thread.sleep(2000);

    }
}






