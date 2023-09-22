package com.cydeo.runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber-reports.json",
        },
        features = "src/test/resources/features",
        glue = "src/test/java/com/cydeo/step_definitions",
        dryRun = false,
        tags = ""
)
public class CukesRunners {
}