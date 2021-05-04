package co.com.choucair.retotecnicobancolombia.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/retoTecnicoBancolombia.feature",
        tags = "@stories",
        glue = "co.com.choucair.retotecnicobancolombia.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
