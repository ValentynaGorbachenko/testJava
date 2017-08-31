package testJava;

public class TestClass2 {
	public static void main(String [] args) {
		System.out.println("Hello! " + args) ;
		
		// testing Point class
		Point x = new Point();
		System.out.println(x);
		x.x = 4; 
		x.y = 2;
		System.out.println(x);
		// testing center method
		Point y = x.center(new Point());
		System.out.println(y);
		//testing scale method
		Point z = new Point(4, 2);
		System.out.println(z);
		z.scale();
		System.out.println(z);
		
		// testing TestClass1
		String[] str2 = new String[2];
		str2[0] = "a";
		str2[1] = "b";
		TestClass1.main(str2);
	}
}
