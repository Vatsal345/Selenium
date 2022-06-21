package tests;

import selenium.Test4;

public class Test1 {
	
	//object - create for class (non static class)
	// ClassName objName = new ClassName();
	
	static Test1 t1 = new Test1();   // object created for non static method from Test1
	static Test2 t2 = new Test2();   // object created for non static method from Test2.java
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4();   // object created for non static method from Test4.java from different package

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("I am in main method");
       printMe();
       scanMe();
       System.out.println("After scanMe");
       t1.testMe();
       t1.useMe();
       Test2.red();     //static method from different class
       t2.blue();       //non static method from different class
       Test3.circle();
       t3.square();
       Test4.audi();
       t4.bmw();       //static method from different class and different package
       ArgumentsTest.sum(25,25);  //25+25
	}
	
	public static void printMe()  {
		System.out.println("printMe");
	}
	
	public static void scanMe()  {
		System.out.println("scanMe");
	}
	
	public void testMe()  {
		System.out.println("testMe");
	}
	
	public void useMe()  {
		System.out.println("useMe");
	}

}
