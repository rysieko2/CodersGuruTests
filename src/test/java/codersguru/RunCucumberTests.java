package codersguru;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports",
                "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml"},
        features = {"C:\\Users\\Prince\\IdeaProjects\\CodersGuruTests\\src\\test\\java\\codersguru\\cucumber\\RegisterUser.feature",
                "C:\\Users\\Prince\\IdeaProjects\\CodersGuruTests\\src\\test\\java\\codersguru\\cucumber\\BookMentor.feature"},
        glue = {"codersguru.cucumber"},
        monochrome = true
)

public class RunCucumberTests {}

