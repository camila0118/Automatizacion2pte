package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import usersinterfaces.ProductPage;

public class CompareProduct implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ProductPage.COMPARE_PRODUCT).viewedBy(actor).asString();
    }

    public static CompareProduct compare(){
        return new CompareProduct();
    }

}
