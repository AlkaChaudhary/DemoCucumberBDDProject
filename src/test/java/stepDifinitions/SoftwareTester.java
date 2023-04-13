package stepDifinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SoftwareTester {
	 @Given("^I am ([a-zA-Z]{1,}) Software Tester$")
	    public void i_am_good_software_tester(String testerType) throws Throwable {
	        System.out.println(">>I am " +testerType+ " software Tester");
	    }

	    @When("^I goto work$")
	    public void i_goto_work() throws Throwable {
	        System.out.println(">>I goto work");
	    }
	    
	    @And("^I (.*) with it$")
	    public void i_involve_with_it(String workType) throws Throwable {
	    	//int a= 10/0;
	    	System.out.println(">>I "+workType+" with it"); 
	    }
	    
	    @Then("^My boss ([a-zA-Z]{1,}) me$")
	    public void my_boss_loves_me(String reaction) throws Throwable {
	        System.out.println("my boss "+reaction+" me");
	    }

	    
}
