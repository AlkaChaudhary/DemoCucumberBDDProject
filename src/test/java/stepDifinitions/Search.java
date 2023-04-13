package stepDifinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

@Given("^I visit website as a guest user$")
public void I_visit_website_as_a_guest_user() {
	System.out.println(">>Given--I visit website as a guest user");
}

@When("^I select books option from the dropDown$")
public void I_select_books_option_from_the_dropDown() {
	System.out.println(">>When--I select books option from the dropDown");
}

@And("^I click on search option$")
public void I_click_on_search_option() throws Throwable {
	System.out.println(">>And--I click on search option");
	
}

@Then("^I should see Amazon BookStore heading$")
public void i_should_see_amazon_bookstore_heading() throws Throwable {
	System.out.println(">>Then--I should see Amazon BookStore heading");
}

@But("^I should not see other category prducts$")
public void i_should_not_see_other_category_prducts() throws Throwable {
    System.out.println(">>But--I should not see other category prducts");
}


@When("^I select Electronics option from the dropDown$")
public void i_select_electronics_option_from_the_dropdown() throws Throwable {
    System.out.println(">>When--I select electronics option from the dropDown");
}


@Then("^I should see  Electronics store heading$")
public void i_should_see_electronics_store_heading() throws Throwable {
    System.out.println(">>Then--I should see Electronics store heading");
}








}
