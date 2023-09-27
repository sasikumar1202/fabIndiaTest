package runnerpackage;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features =  {"src/test/resources/fabindia.feature"},dryRun = !true, glue = "stepdef",
    snippets = SnippetType.CAMELCASE,monochrome = true, tags = {"@fp,@kp"},
    plugin = {"html:reports","pretty","json:reports/result.json", "junit:reports/result.xml"})
public class FabRunner extends AbstractTestNGCucumberTests {

}
