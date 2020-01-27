package co.com.qvision.eribank.tasks;

import co.com.qvision.eribank.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class LoginInTheApp implements Task {
    private String userName, userPassword;

    public LoginInTheApp(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }


    public static LoginInTheApp withUserData(String userName, String userPassword) {
        return Tasks.instrumented(LoginInTheApp.class,userName,userPassword);
    }

    @Step("{0} enter user credentials")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userName).into(LoginPage.USER_NAME),
                Enter.theValue(userPassword).into(LoginPage.USER_PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );


    }
}
