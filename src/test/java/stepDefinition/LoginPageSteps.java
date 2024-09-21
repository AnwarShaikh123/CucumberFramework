package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static pages.HomePage.click_Sign_link;
import static pages.HomePage.click_hamburger_menu;
import static pages.LoginPage.*;
import static pages.RegistrationPage.visibility_user_registration_page;

public class LoginPageSteps {
    @When("user successfully enters the log in details")
    public void user_should_able_to_view_the_product_category_page() throws InterruptedException {
        sendKeys_user_Name();
        senKeys_password();
        click_Login_Btn();
    }
    @When("User clicks on new Registration button")
    public void user_clicks_on_new_Registration_button() throws InterruptedException{
        click_register();
    }
}
