package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"classpath:features"},
                 glue = {"stepDefinitions"},
                 monochrome = false,
                 dryRun = false,
                 tags = "@LoginPage",
                 plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})

public class Home_runner extends AbstractTestNGCucumberTests {
}
