package co.com.sena.stepdefinitions;

import co.com.sena.exceptions.MessageProductException;
import co.com.sena.questions.ValidationShopping;
import co.com.sena.tasks.ShoppingcartTasks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.apache.bcel.Constants;
import org.apache.bcel.classfile.Constant;
import org.hamcrest.Matchers;

public class ShoppingcartStepDefinitions {

    @Given("add a product to cart")
    public void addAProductToCart() {
        OnStage.theActorInTheSpotlight().wasAbleTo(ShoppingcartTasks.click());
    }

    @When("see the product in the cart")
    public void seeTheProductInTheCart() {

    }

    @Then("remove product from cart")
    public void removeProductFromCart() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationShopping.compare(),
                Matchers.is(Matchers.equalTo("Sandalias color caramelo con detalles color blanco, vainilla y oro en cuero - 3")))
                .orComplainWith(MessageProductException.class));
    }
}
