package qilin.zhang.test.AddressModification;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.Assert.*;

public class AddressModificationStepdefs {
    private String oldAddress;
    private String newAddress;
    private String answerForActive;

    String changeAddress(String newAddress, String date) {
        if(this.answerForActive.equals("inactive")) {
            return this.oldAddress;
        } else {
            return date.equals("") ? newAddress :  this.oldAddress;
        }
    }
    @Autowired
    private MockMvc mvc;

    ResultActions action;

    //@Steps
    Active active;

    @Given("a subscriber with an main address {string} in France")
    public void a_subscriber_with_an_main_address_in_france(String oldAddress) {
        this.oldAddress = oldAddress;
    }
    @When("the advisor connected to {string} modify the subscriber's address to {string} with effect date {string}")
    public void the_advisor_connected_to_modify_the_subscriber_s_address_to_with_effect_date(String channel, String newAddress, String date) {
        this.answerForActive = active.whichActive(channel);
        this.newAddress = changeAddress(newAddress, date);
    }
    @Then("the active should be {string}")
    public void the_active_should_be(String expectedActive) {
        assertEquals(expectedActive, this.answerForActive);
    }
    @Then("the address should be changed to {string} if main address is active and date is empty")
    public void the_address_should_be_changed_to_if_main_address_is_active_and_date_is_empty(String expectedNewAddress) {
        assertEquals(expectedNewAddress, this.newAddress);
    }
}
