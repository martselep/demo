package com.example.demo.bdd;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(CucumberReportRunner.class)
@CucumberOptions(features = "classpath:features")
public class CucumberTest {
}
