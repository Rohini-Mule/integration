package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features\\myfeature_2.feature",glue="testcases",
                 plugin="html:target//htmlreport",
                 tags= {"@payment"})
public class RunnerClass {

}
