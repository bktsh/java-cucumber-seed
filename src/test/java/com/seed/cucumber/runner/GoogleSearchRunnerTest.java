package com.seed.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:feature"
        , tags = "@Working"
        , glue = "com.seed.cucumber.steps"
        , format = {"pretty", "json:target/cucumber.json",  "html:target/cucumber"}
)
public class GoogleSearchRunnerTest extends BaseRunner {

    @BeforeClass
    public static void setUpSuite(){
        BaseRunner.setUpSuite();
    }

    @AfterClass
    public static void tearDownSuite(){
        webDriver.quit();
        webDriver = null;
    }
}
