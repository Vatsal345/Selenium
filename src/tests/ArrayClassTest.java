package tests;

public class ArrayClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tool = "Selenium";
		System.out.println(tool);
		String tools[] = {"Selenium", "Java", "Python", "Maven", "Junit"};
		System.out.println(tools.length);
		
		
		System.out.println(tools[0]);
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		System.out.println(tools[4]);
		
		int numbers[] = {1,5,7,9,11};
		System.out.println(numbers.length);
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]); 
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		Object mix[] = {"selenium", 123, "abc"};
		System.out.println(mix.length);
		
		/* System.out.println(mix[0]);
		System.out.println(mix[1]);
		System.out.println(mix[2]); */
		
		for (int i = 0; i<mix.length; i++) {
			System.out.println(mix[i]);
		}


	}

}
