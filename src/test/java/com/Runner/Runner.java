package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Loginpage.feature", 
                 glue={"com.StepDefinition","com.Hooks"},
                 dryRun=false,
                 plugin={"html:Report/ExecutionReport.html", "json:Report/Execution report.json"})

public class Runner {

}
