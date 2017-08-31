package testJava;

public class TestClass2 {
	public static void main(String [] args) {
		System.out.println("Hello! " + args) ;
		Point x = new Point();
		System.out.println("x");
		x.printPoints();
		x.x = 4; 
		x.y = 2;
		System.out.println("x");
		x.printPoints();
		Point y = x.center(new Point());
		System.out.println("y");
		y.printPoints();
		Point z = new Point(4, 2);
		System.out.println("z");
		z.printPoints();
		z.scale();
		z.printPoints();
		
		String[] str2 = new String[2];
		str2[0] = "a";
		str2[1] = "b";
		TestClass1.main(str2);
	}
}
