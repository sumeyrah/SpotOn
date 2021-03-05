package spotOn.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import spotOn.page.DetailsPuppyPage;
import spotOn.page.HomePage;
import spotOn.page.PersonInfoPage;
import spotOn.page.ProceedPage;

public class PuppyStepDefinitions {

    DetailsPuppyPage detailsPuppyPage=new DetailsPuppyPage();
    HomePage homePage = new HomePage();
    PersonInfoPage personInfoPage=new PersonInfoPage();
    ProceedPage proceedPage=new ProceedPage();

    @Given("^Client wants to go to Puppy Adoption Agency$")
    public void client_wants_to_go_to_Puppy_Adoption_Agency() {
        System.out.println("==============");
    }

    @Then("^Client wants to adopt \"([^\"]*)\"$")
    public void client_wants_to_adopt(String arg1) {
        detailsPuppyPage.clickAdoptMe(arg1);
    }

    @Then("^Client wants to add \"([^\"]*)\"$")
    public void client_wants_to_add(String arg1) {
    proceedPage.clickChewToy();
    proceedPage.clickTravelCarrier();
    }

    @Then("^Client wants to complete adoption$")
    public void client_wants_to_complete_adoption() {

    }

    @Then("^Client wants to enter information$")
    public void client_wants_to_enter_information(DataTable arg1) {

    }

    @Then("^client wants to pay with \"([^\"]*)\"$")
    public void client_wants_to_pay_with(String arg1) {


    }

}