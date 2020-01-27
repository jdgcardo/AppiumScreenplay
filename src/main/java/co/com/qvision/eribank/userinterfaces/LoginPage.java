package co.com.qvision.eribank.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USER_NAME = Target.the("User Name field").located(By.id("com.experitest.ExperiBank:id/usernameTextField"));
    public static final Target USER_PASSWORD = Target.the("User Password field").located(By.id("com.experitest.ExperiBank:id/passwordTextField"));
    public static final Target LOGIN_BUTTON = Target.the("Boton Login").located(By.id("com.experitest.ExperiBank:id/loginButton"));



}
