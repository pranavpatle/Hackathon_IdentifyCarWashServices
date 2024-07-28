package TestRunner;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions
(features= {".//featurefiles"},
//features={"@target/rerun.txt"},
glue="Stepdefinatons",
plugin={"pretty","html:reports/myreport.html",
		"rerun:target/rerun.txt",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
dryRun=false, //it will map stepdefinition methods with scenario
	monochrome=true,//when we run feature file will get some junk characters like *,? to avoid those character will use monochrome=true in o/p
	publish=true
		
	)	
		

public class TestRun extends AbstractTestNGCucumberTests {

	

	

}
