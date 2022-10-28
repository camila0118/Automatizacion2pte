package com.co.senasoft.runners;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
snippets = CucumberOptions.SnippetType.CAMELCASE,
glue = "com.co.senasoft.stepsdefinitions",
dryRun = true)
public class LoginRunner {

}
