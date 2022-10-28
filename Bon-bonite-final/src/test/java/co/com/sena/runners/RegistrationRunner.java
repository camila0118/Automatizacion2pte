package co.com.sena.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registration.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "co.com.sena.stepdefinitions")


public class RegistrationRunner {

}
