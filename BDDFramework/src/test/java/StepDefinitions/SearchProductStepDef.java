package StepDefinitions;

import POM.SearchProductPage;
import Utilities.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductStepDef extends BaseDriver
{
	SearchProductPage spp;
	BaseDriver bd;
	
	
	@Given(": user have entered searchinput")
	public void user_have_entered_searchinput() 
	{
		bd = new BaseDriver();
		spp = new SearchProductPage(driver);
		spp.clickonSearchbutton();
	    
	}

	@When(": User clicks on Search button")
	public void user_clicks_on_search_button() 
	{
		spp.enterSearchinput();
	}

	@Then(": User will see result for the searched input")
	public void user_will_see_result_for_the_searched_input() 
	{
		spp.getsearchresults();	
	}


}
