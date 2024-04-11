package StepDefinition;


import com.util.Libdriver;

import io.cucumber.java.Before;

public class Hooks extends Libdriver {
	
	@Before
	public void dedicatedDriver() {
		getDriver();
	}
}
