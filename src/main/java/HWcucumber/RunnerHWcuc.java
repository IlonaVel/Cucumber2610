package HWcucumber;
import hillel.Config.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

public class RunnerHWcuc {

    @RunWith(Cucumber.class)
    @CucumberOptions(

            features = "src/main/java/HWcucumber/features",//path to feature files
            glue = "HWcucumber.MainPageCucSteps",//package path
            tags = "@ALL",//list feature files for run
            publish = true,
            dryRun = false,
            monochrome = true


    )
    public class RunnerHWcuc1  {

        @BeforeClass
        public static void createDriver() {
            //,CUCUMBER_PUBLISH_TOKEN=4634b17e-a0cd-4811-bc62-3f5f98da054d
            System.setProperty("CUCUMBER_PUBLISH_TOKEN", "4634b17e-a0cd-4811-bc62-3f5f98da054d");
        }

    }
}
