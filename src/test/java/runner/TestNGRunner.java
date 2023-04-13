package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin={"html:target/cucumber_report.html"},
				 features="src/test/java/features",
				 glue="stepDifinitions",
				 tags="@All")
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
