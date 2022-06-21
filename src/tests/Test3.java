package tests;

public class Test3 {
	
	static Test3 t3 = new Test3();  // object created for non static method from Test3.java
	static Test1 t1 = new Test1(); // object created for non static method from Test1.java

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circle();
		t3.square();
		Test1.printMe();
		t1.testMe();
		

	}
	
	public static void circle() {
		System.out.println("circle");
	}
	
	public void square()  {
		System.out.println("square");
	}

}
