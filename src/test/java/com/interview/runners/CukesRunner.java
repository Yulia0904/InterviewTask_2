package com.interview.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {

                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/interview/step_defs",
        dryRun = false,
        tags = "@bing",
        publish = true
        //mvn clean test -Dcucumber.options="src/test/resources/features --tags @bing"
        //mvn clean test -Dcucumber.feature="src/test/resources/features" -Dcucumber.filter.tags="@bing"
)
public class CukesRunner {


}
