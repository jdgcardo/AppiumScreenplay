package co.com.qvision.eribank.stepdefinitions;

import co.com.qvision.eribank.tasks.LoginInTheApp;
import co.com.qvision.eribank.utils.MyDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginUserStepDefinitions {

    private String userName = "company";
    private String userPassword = "company";

    @Before
    public void inicializar(){
        setTheStage(new OnlineCast());
    }

    @Given("^that Juan open the app$")
    public void thatJuanOpenTheApp() {
        theActorCalled("Juan").can(BrowseTheWeb.with(MyDriver.abrirApp()));
    }

    @When("^he enters with a valid user data$")
    public void heEntersWithAValidUserData() {
        theActorInTheSpotlight().attemptsTo(LoginInTheApp.withUserData(userName,userPassword));

    }

    @Then("^he can see the main menu$")
    public void heCanSeeTheMainMenu() {
        //OnStage.theActorInTheSpotlight().should(seeThat(HomePageQuestion.isVisible()));
    }
}
