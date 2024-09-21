package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LoggedInPage.*;


public class LoggedInPageSteps {

    @Then("User should be  able to view the product category page")
    public void successfully_enters_the_login_details() throws InterruptedException {
        visibility_product_category_formal_shoes();
        visibility_product_category_sports_shoes();
        visibility_product_category_sneaker_shoes();

    }
}
