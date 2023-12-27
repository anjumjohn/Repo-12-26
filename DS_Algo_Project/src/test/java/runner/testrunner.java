package runner;
 
import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"stepdefinition","hooks"},
plugin={"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		)
public class testrunner extends AbstractTestNGCucumberTests{
	//@DataProvider(parallel=true)
	//public Object[][]scenario() {
		//return super.scenarios();
	}

