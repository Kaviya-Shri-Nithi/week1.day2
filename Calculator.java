package week1.day2;

public class Calculator {
	
	public int add(int i, int j, int k) {
		return i+j+k;
	}
	public int sub(int d1, int d2) {
		return d1-d2;
	}
	
	public double mul(double d1, double d2) {
		return d1*d2;
	}
	public float div(float i, float j) {
		return i/j;
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int i = 5,j =2,k=3;
		double d1= 20.5, d2= 12.6;
		float f=10.5f, f1=5.2f;
		System.out.println(cal.add(i, j, k));
		System.out.println(cal.sub(i,j));
		System.out.println(cal.mul(d1, d2));
		System.out.println(cal.div(f, f1));
	}

}
