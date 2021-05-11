package stepDefination;


import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberFeatureWrapper;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleEventWrapper;
import io.cucumber.testng.TestNGCucumberRunner;




//@RunWith(Cucumber.class) 

@CucumberOptions(

		features= {".//src/main/java/stepDefination/Feature_file/ChapterModule.feature"},

glue = {"stepDefination"},

dryRun = false,
tags = {"@Tuto"},
monochrome = true,
strict = true,





plugin = { "pretty","html:test-output", "json:target/cucumber.json"})

		


//public class runTest {}



public class TestNGRunner {

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)

	public void setUpClass() throws Exception {

		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

		

	}

	@Test(groups = "Cucumber", description = "Runs Cucumber Feature", dataProvider = "scenarios")

	public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {

		testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());

				

	}

	@DataProvider

	public Object[][] scenarios() throws InterruptedException {		

		return testNGCucumberRunner.provideScenarios();

	}

	@AfterClass(alwaysRun = true)

	public void tearDownClass() throws Exception {

		testNGCucumberRunner.finish();

//		BaseUtil.logger.info("Teardown");

//		BaseUtil.driver.quit();

	}

}
