package debugging;

import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;

import ressources.testA;


public class Debogeur {
	
	 public static void main(String args[]) throws ClassNotFoundException {
	      
	        Request request = Request.method(Class.forName("test.ressources.testA"),"testUpJohn");

	        Result result = new JUnitCore().run(request);
	        System.out.println(result.wasSuccessful() ? 0 : 1);
	        System.out.println(result.getFailures().get(0).getTestHeader());
	        StackTraceElement [] tab = result.getFailures().get(0).getException().getStackTrace();
	        for (int i = 0 ; i <tab.length; i ++){
	        	
	        	if(tab[i].getClassName().equals(testA.class.getName()))
	        		System.out.println(tab[i].getClassName() +" "+ tab[i].getMethodName()+" "+tab[i].getLineNumber());
	        }
	        System.out.println(result.getFailures().get(0).getTrace());
	        
	    }

}
