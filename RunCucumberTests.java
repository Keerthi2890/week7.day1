package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefs.ProjectSpecificMethods;

@CucumberOptions(features ="src/main/java/features",glue="stepDefs", monochrome=true, publish=true)

public class RunCucumberTests extends ProjectSpecificMethods{

}