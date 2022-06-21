package tests;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> tools = new ArrayList<String>();
		
		tools.add("selenium");
		tools.add("Jira");
		tools.add("Junit");
		tools.add("TestNG");
		
		System.out.println(tools.size());
		
		tools.add("Git");
		
		System.out.println(tools.size());
		
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		System.out.println(tools.get(4));
		
		tools.remove(2);
		System.out.println(tools.size());
		System.out.println(tools.get(2));

	}

}
