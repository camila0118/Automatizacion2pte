package com.co.serenity.tasks;

import com.co.serenity.models.DataProduct;
import com.co.serenity.userinterfaces.AddArticlePage;
import com.co.serenity.userinterfaces.InitialPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.springframework.beans.CachedIntrospectionResults;

public class AddProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(InitialPage.BTN_NEW_ARTICLE));

        actor.attemptsTo(Enter.theValue("IPHONE 13 PRO MAXX", " ", "SAMSUMG").into(AddArticlePage.TXT_TITLE),
                Enter.theValue("Es un iphone muy bonito", " ", "ultimo modelo").into(AddArticlePage.TXT_DESCRIPTION),
                Enter.theValue("Caracteristicas de nuestro iphone", " ", "gama alta").into(AddArticlePage.TXT_BODY),
                Enter.theValue("IPHONE", " ", "SAMSUNG 12").into(AddArticlePage.TXT_TAGS),
                Click.on(AddArticlePage.BTN_PUBLISH_ARTICLE),
                Click.on(InitialPage.BTN_HOME));

        actor.attemptsTo(Click.on(InitialPage.BTN_GLOBAL_FEED));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static AddProduct in() {
        return Tasks.instrumented(AddProduct.class);
    }


}
