package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features"},
        glue = {"steps","utils"},
        tags = "@api"
)

public class RunCucumberTest extends AbstractTestNGCucumberTests{
    }
