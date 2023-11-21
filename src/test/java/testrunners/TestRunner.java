package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = "src/test/java/features",
        glue = "stepdefintions",
        		plugin = {
                        "pretty",
                        "html:target/SystemTestReport/html", 
                        "json:target/SystemTestReport/json/report.json", 
                        "junit:target/SystemTestReport/junit/report.xml" 
		}
)
public class TestRunner {
}