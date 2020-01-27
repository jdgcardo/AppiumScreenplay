package co.com.qvision.eribank.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions
        (
                features ="src/test/resources/features/login_user.feature",
                glue = "co.com.qvision.eribank.stepdefinitions",
                snippets = SnippetType.CAMELCASE
        )

public class LoginUserRunner {
}
