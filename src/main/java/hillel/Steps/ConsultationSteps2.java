package hillel.Steps;

import hillel.config.BaseClass;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.DataTable;
import pageObjects.MainPage;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

public class ConsultationSteps2 extends BaseClass {
    MainPage mainPage=new MainPage(getDriver());
    @When("Create query")
    public void createQuery(DataTable dataTable){

        //################1

         List<List<String>> list = dataTable.asLists();
/*
       int a = 1 + (int) ( Math.random() * list.size()-1 );
        List<String> l=list.get(a);
        mainPage.sentDataToForm(l.get(0),l.get(1),l.get(2));
        Thread.sleep(2000);
##############2
        List<Map<String,String>> mapList=dataTable.asMaps();
        int a = 1 + (int) ( Math.random() * mapList.size()-1 );
        mainPage.sentDataToForm(mapList.get(a).get("name"),mapList.get(a).get("mail"),mapList.get(a).get("telephone"));
        Thread.sleep(2000);
        List<Map<String,String>> mapList=dataTable.asMaps();
        int a = 1 + (int) ( Math.random() * mapList.size()-1 );
        Map<String,String> map=mapList.get(a);
        mainPage.sentDataToForm(map.get("name"),map.get("mail"),map.get("telephone"));
        Thread.sleep(2000);
*/

    }

//    private static List<List<String>> getList(DataTable dataTable) {
//        return dataTable.asLists();
//    }
}

