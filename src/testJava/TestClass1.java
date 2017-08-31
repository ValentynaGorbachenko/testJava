package testJava;

public class TestClass1 {
	public static void main(String [] args) {
		String str = "Hello!";
		System.out.println("hey "+str);
		System.out.println(args);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
