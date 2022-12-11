package stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:.\\src\\test\\resources\\feature", glue= {"stepdefinition"},
monochrome= true,
stepNotifications = true,
//plugin={"pretty", "html:target/HtmlReports"}
//plugin= {"pretty","json:target/jsonReports/report.json"}
plugin= {"pretty","junit:target/junitReports/report.xml"}

		)

public class Testrunner  {

}
