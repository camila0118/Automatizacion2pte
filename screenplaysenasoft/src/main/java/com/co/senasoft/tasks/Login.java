package com.co.senasoft.tasks;

import com.co.senasoft.interactions.WaitElement;
import com.co.senasoft.models.Credentials;
import com.co.senasoft.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    Credentials credentials;

    public Login(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentials.getUsername()).into(LoginPage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(WaitElement.untilBeEnable(LoginPage.BTN_LOGIN));
        //Esto es una espera Explicita: actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));
    }


    public static Login enter(Credentials credentials) {
        return Tasks.instrumented(Login.class, credentials);
    }

}
