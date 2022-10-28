package com.co.tasks;

import com.co.interactions.WaitElement;
import com.co.models.Credentials;
import com.co.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private Credentials credentials;

    public Login(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitElement.untilAppears(LoginPage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue(credentials.getUser()).into(LoginPage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));
    }



    public static Login heUseris(Credentials credentials)
    {
        return Tasks.instrumented(Login.class,credentials);
    }
}
