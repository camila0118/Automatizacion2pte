package com.co.serenity.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/add_product.feature",
snippets = CucumberOptions.SnippetType.CAMELCASE,
glue = "com.co.serenity.stepsdefinitions")
public class AddRunner {




}
