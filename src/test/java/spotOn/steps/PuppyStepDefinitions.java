package spotOn.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import spotOn.page.DetailsPuppyPage;
import spotOn.page.HomePage;
import spotOn.page.PersonInfoPage;
import spotOn.page.ProceedPage;

import java.util.Map;

public class PuppyStepDefinitions {

    DetailsPuppyPage detailsPuppyPage=new DetailsPuppyPage();
    HomePage homePage = new HomePage();
    PersonInfoPage personInfoPage=new PersonInfoPage();
    ProceedPage proceedPage=new ProceedPage();

    @Given("^Client wants to go to Puppy Adoption Agency$")
    public void client_wants_to_go_to_Puppy_Adoption_Agency() {
    }

    @Then("^Client wants to adopt \"([^\"]*)\"$")
    public void client_wants_to_adopt(String arg1) {
        homePage.clickViewDetails(arg1);
        detailsPuppyPage.clickAdoptMe(arg1);
    }

    @Then("^Client wants to adapt another puppy$")
    public void client_wants_to_adapt_another() {
         homePage.goBackHomePage();
    }
    @Then("^Client wants to add \"([^\"]*)\"$")
    public void client_wants_to_add(String arg1) {
        proceedPage.selectAccesories(arg1);
    }

    @Then("^Client wants to complete adoption$")
    public void client_wants_to_complete_adoption() {
        proceedPage.clickCompleteTheAdoption();
    }

    @Then("^Client wants to enter information$")
    public void client_wants_to_enter_information(Map<String,String> value) {
        personInfoPage.fillOutInfo(value);
    }

    @Then("^client wants to pay with \"([^\"]*)\"$")
    public void client_wants_to_pay_with(String value) {
        personInfoPage.setSelectPaymentMethod(value);
    }
    @Then("^Client wants to place order$")
    public void client_wants_to_place_order()  {
        personInfoPage.placetheOrder();
    }

    @Then("^client should be able  to see message as \"([^\"]*)\"$")
    public void client_should_be_able_to_see_message_as(String arg1) {
        homePage.verifyTheOrder(arg1);
    }




}