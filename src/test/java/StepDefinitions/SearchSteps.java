package StepDefinitions;

import Implementation.Product;
import Implementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	Product product;
	Search search;
	@Given("I have a search field on Amazon page")
	public void i_have_a_search_field_on_amazon_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step 1");
	}

	@When("I search for a product with name {string} and pricre {int}")
	public void i_search_for_a_product_with_name_and_pricre(String productName, Integer price) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Product Name: "+productName+"Price: "+price);
		product=new Product(productName,price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step 3");
		search=new Search();
		//String name=search.displayProduct(product);
		//Assert.assertEquals(product.getProductName(),name);
	}
}
