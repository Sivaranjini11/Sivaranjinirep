package sivapack;

import cucumber.api.java.en.Given;

public class demo {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	       System.out.println("Siva");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		
		System.out.println("Siva");
	
	    
	}


}
