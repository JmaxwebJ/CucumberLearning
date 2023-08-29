package vaibhav.saini;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:/Users/DEEL/eclipse-workspace/vaibhav.saini/src/main/resources/PracticeForm.feature", glue="steps",tags = "@UIQA")



public class Runner extends AbstractTestNGCucumberTests {

	// @DataTable and not @Smoke and not @Prod
}


