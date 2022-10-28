package co.com.sena.questions;


import co.com.sena.userinterface.ShoppingcartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationShopping implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ShoppingcartPage.TXT_COMPARE).viewedBy(actor).asString();
    }

    public static ValidationShopping compare() {
        return new ValidationShopping();
    }

}
