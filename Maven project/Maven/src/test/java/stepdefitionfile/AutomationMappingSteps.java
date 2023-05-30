package stepdefitionfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class AutomationMappingSteps {

    @When("User enter the username {string}  and password {string}")
    public void enterUsernamePassword(String userName, String password){


    }
      @Given("User navigates to Salesforce application")
     public void sample(){

    }
    @Given("User launch the browser and navigate to the URL")
    public void launchBrowser(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://book.spicejet.com/ ");
    }

    @And("User clicks the login button")
    public void loginButton() {
        
    }

    @Then("Validate the error message")
    public void errorMessageValidation() {
    }

    @Then("Validate Whether the user navigates to homepage")
    public void validateWhetherTheUserNavigatesToHomepage () {
    }

    @When("User selects the specific dropdown value")
    public void handleDropdown() {

        WebElement currencyElement = Driver.findelements(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency));

        Select selectCurrency =new Select(currencyElement);

       //SelectCurrency.selectByIndex(3);
       //SelectCurrency.selectByVisibleText("EUR")
        SelectCurrency.SelectByValue("GBP");
        Driver.FindElement(By.id(""))


}
