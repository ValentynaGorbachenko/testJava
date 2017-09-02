package testJava;

public class GetSum {
	public static void main(String [] args) {
		int a = 1;
		int b = 2;
		getSum(a,b);
	}
	public static int getSum(int a, int b) {
		int res = 0;
		
		if (a != b) {
			for(int i=0; a>b || b>a; i++) {
				if((a>>i)&1 == 0 || (b>>i)&1 == 0) {
					
				}
			}
		}
	}
	
	
	
	
	
	/*
	public static int getSum(int a, int b) {
		int num = a*2;
		if (a != b) {
			num = bitSum(Integer.toBinaryString(a), Integer.toBinaryString(b));
		}
		return num;
		
	}
	public static int bitSum(String a, String b) {
		int res = 0;
		// temp object
		
		return res;
	}
	public static String addBits(String a, String b) {
		String x = "";
		return x;
	}
	*/
}
