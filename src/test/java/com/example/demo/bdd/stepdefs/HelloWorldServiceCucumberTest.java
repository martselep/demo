package com.example.demo.bdd.stepdefs;

import com.example.demo.HelloWorldService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

public class HelloWorldServiceCucumberTest {

    final String name = "Marianna";
    final HelloWorldService helloWorldService;
    String result;
    Logger logger = LoggerFactory.getLogger(HelloWorldServiceCucumberTest.class);

    @Autowired
    public HelloWorldServiceCucumberTest(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Given("a name")
    public void aName() {
        logger.info(name);
    }

    @When("I call the hello world service")
    public void iCallTheHelloWorldService() {
        result = helloWorldService.helloName(name);
    }

    @Then("it should return with greeting the given name")
    public void itShouldReturnWithGreetingTheGivenName() {
        Assertions.assertThat(result)
                  .isEqualTo("Hello" + name);
    }
}
