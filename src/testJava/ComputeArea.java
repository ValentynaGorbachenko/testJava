package testJava;
import java.util.Scanner;

public class ComputeArea {
	public static double computeCircle(double radius) {
		
		return radius * radius * 3.14159;
	}
	public static double computeCircleFromConsoleInut() {
		Scanner input = new Scanner(System.in);
		double res = input.nextDouble();
		
		return ComputeArea.computeCircle(res);
	}
}
