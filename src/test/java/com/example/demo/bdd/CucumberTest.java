package com.example.demo.bdd;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(CucumberReportRunner.class)
@CucumberOptions(features = "src/test/resources/features/",plugin = {
        "pretty",
        "html:target/cucumber-html-report",
        "json:target/cucumber-report.json",
        "junit:target/cucumber.xml",
        "rerun:target/rerun.txt",
},
        glue = "com.example.demo.bdd"
)
public class CucumberTest {
}
