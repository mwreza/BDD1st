package step_defination;

import java.io.IOException;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase{
	
	public Hooks() throws IOException {
		super();
		
	}

	@Before
	public void loadBroswer() {
	initialization ();
	}
	
	
	@After
	public void closeBroswer() {
//		ShutDown();
	}
		

}
