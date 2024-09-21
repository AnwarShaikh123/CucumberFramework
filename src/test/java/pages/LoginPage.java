package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {


    public static String  user_text_id="usr";
    public static String  password_text_id="pwd";
    public static String  login_btn_xpath="//input[@value='Login']";
    public static String newRegister_Btn_id = "NewRegistration";

    public static void sendKeys_user_Name() throws InterruptedException {

driver.findElement(By.id(user_text_id)).sendKeys("mohdanwarshaikh9@gmail.com");


    }
    public static void  senKeys_password() throws InterruptedException {
        driver.findElement(By.id(password_text_id)).sendKeys("Anwar@123");
    }

    public static void click_Login_Btn(){
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }
    public static void click_register() throws InterruptedException{
        driver.findElement(By.id(newRegister_Btn_id)).click();
    }
}
