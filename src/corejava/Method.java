package corejava;

public class Method {
	 static void method1() {
		
		 System.out.println("Static Method1 is called");
		 method2();
	}
	static void method2() {
		System.out.println("Static Method2 is called");
	}
	void method3() {
		System.out.println("Instance Method1 is called");
		method4();

	}
	void method4() {
		System.out.println("Instance Method2 is called");
		method1();//it calls static method
	}

	public static void main(String[] args) {
			Method m1= new Method();
			m1.method3();//here we called Instance method
			//we cannot call instance method from static method
			//but we can call static method from instance method 
	
	}

}
