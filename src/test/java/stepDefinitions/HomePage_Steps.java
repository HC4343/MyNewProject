package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage_Steps {
    private WebDriver driver;

    @Before("@LoginPage")
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

    }
    @After
    public void tearDown(){
        driver.quit();
        }


    @Given("user accesses login page")
    public void user_accesses_login_page() {
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");

    }
    @When("user enters {string}")
    public void user_enters_username(String username) {
        driver.findElement(By.xpath("//input[@id='text']")).sendKeys(username);

    }
    @And("user enters password {}")
    public void user_enters_password(String password) {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

    }
    @And("user clicks login button")
    public void user_clicks_login_button() {
        driver.findElement(By.xpath("//button[@id='login-button']")).click();

    }

    @Then("user sees success message")
    public void user_sees_success_message() {


    }

    @And("user enters incorrect username")
    public void user_enters_incorrect_username() {
        driver.findElement(By.xpath("//input[@id='text']")).sendKeys("ebdriver");

    }

    @When("user enters webdriver1234")
    public void user_enters_webdriver1234() {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("webdriver1234");

    }

    @Then("user sees error message")
    public void user_sees_error_message() {

    }
}
