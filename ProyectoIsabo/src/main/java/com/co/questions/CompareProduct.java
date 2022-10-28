package com.co.questions;

import com.co.userinterfaces.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareProduct implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
      return Text.of(ProductPage.LBL_CAPTURE_TEXT).viewedBy(actor).asString();

    }


    public  static CompareProduct compare(){
        return new CompareProduct();
    }
}
