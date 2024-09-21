package stepDefinition;

import io.cucumber.java.en.Given;

import static pages.HomePage.*;

public class HomePageSteps {
    @Given("User navigates to the login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        click_hamburger_menu();
        click_Sign_link();
    }
    @Given("User navigates to the Online Products page")
    public void user_navigates_to_the_Online_Products_page() throws InterruptedException {
        click_hamburger_menu();
        click_Online_Products_link();
    }
}
