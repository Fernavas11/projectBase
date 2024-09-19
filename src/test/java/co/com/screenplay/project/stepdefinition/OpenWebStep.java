package co.com.screenplay.project.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class OpenWebStep {

    @Before
    public void setTheStage(){OnStage.setTheStage(new OnlineCast());}


    @Given("{string} opens testing website")
    public void userOpensTestingWebsite(String actor) {

    }

    @When("enter the edge browser")
    public void enterTheEdgeBrowser() {

    }

    @Then("display the title of the web page {string}")
    public void displayTheTitleOfTheWebPage(String textValidation) {

    }
}
