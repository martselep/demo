package com.example.demo.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",plugin = {
        "pretty",
        "json:target/cucumber-report/cucumber.json"

},
        glue = "com.example.demo.bdd"
)
public class CucumberTest {
}
