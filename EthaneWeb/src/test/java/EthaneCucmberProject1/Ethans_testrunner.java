package EthaneCucmberProject1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"../EthaneWeb/src/test/java/EthaneCucmberProject1/Ethene.feature"},
	glue = {"EthaneCucumberProject1"},
    stepNotifications = true,
	plugin = {"pretty","html:CucumberReport/cucumberhtml/destination.html","json:CucumberReport/cucumberjson/cucumber.json"
			 ,"junit:CucumberReport/cucumberxml/cucumber.xml","pretty:CucumberReport/cucumbertxt/cucumber-pretty.txt"},
	monochrome=true,
    dryRun=true  )
public class Ethans_testrunner {

}