package test;

import javax.inject.Singleton;

@Singleton
public class MySubClass extends MyClass implements MyInterface {

    @Override
   public void testMethod() {
   		//change me
       System.out.println("test");
   }
}
