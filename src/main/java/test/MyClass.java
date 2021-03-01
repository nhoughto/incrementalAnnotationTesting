package test;

import javax.inject.Inject;

public class MyClass implements MyInterface {

	@Inject
	private MyHelper helper;

    @Override
   public void testMethod() {
   	   helper.help();
       System.out.println("test");
   }
}
