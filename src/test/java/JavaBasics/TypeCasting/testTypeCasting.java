package JavaBasics.TypeCasting;

public class testTypeCasting {

	public static void main(String[] args) {
//		 B b = new B();	 
//		 //    child to parent    
//		 A aobj=  b;
//		 aobj.testA();
		 //in testA - Class B
		 
//		 aobj.testB();// error 
		 
		 //************************************
		 // parent to child
		 A a1obj= new A();
		 B b = new B();
		 
//		 b= a1obj;// Type mismatch: cannot convert from A to B
		 b= (B) a1obj;
		 //Exception in thread "main" java.lang.ClassCastException: JavaBasics.TypeCasting.A cannot be cast to JavaBasics.TypeCasting.B
//			at JavaBasics.TypeCasting.testTypeCasting.main(testTypeCasting.java:20)
		 b.testA();
		 
		 b.testB();

	}

}
