package testNGDataProviderBasics;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public  class MethodBasics {

	
	@Test
	public void login(Method m)
	{
		System.out.println("methd getName= "+m.getName());
		System.out.println(" m.getParameterCount()= " + m.getParameterCount());
		
		
		System.out.println(" in get getClass "+m.getClass() );
		System.out.println("getReturnType = " + m.getReturnType());
		  String s= create();
		  System.out.println("s="+s);// Ram
	} 
	
	// Can test method return String // yes it returns String
	@Test
	public String create()
	{
		System.out.println("call create ");
		return "Ram";
	}
}
