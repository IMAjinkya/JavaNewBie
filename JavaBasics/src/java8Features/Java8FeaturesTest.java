package java8Features;

public class Java8FeaturesTest {

	public static void main(String[] args) {
		testInterfaceChanges();		
	}
	
	public static void testInterfaceChanges(){
		DefaultTestClass dtc = new DefaultTestClass();
		dtc.method1();
		dtc.defaultMethod();
		//dtc.staticMethod();
		defaultTestIntf.staticMethod();
	}

}


interface defaultTestIntf{
	void method1();
	static void staticMethod(){
		System.out.println("Calling defaultTestIntf | staticMethod");
	}
	default void defaultMethod(){
		System.out.println("Calling defaultTestIntf | defaultMethod");
	}
}

class DefaultTestClass implements defaultTestIntf{

	@Override
	public void method1() {
		System.out.println("Calling DefaultTestClass | method1");
		
	}
}
