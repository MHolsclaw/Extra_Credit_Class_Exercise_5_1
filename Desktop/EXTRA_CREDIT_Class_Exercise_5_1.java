import java.util.Scanner;


public class Class_Exercise_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("x^10 = " + h(inputx()));
		System.out.println("x + y = " + f(inputx(),inputy()));
		System.out.println("Sqrt(x) + Abs(y) + z^y = " + g(inputx(),inputy(),inputz()));
		System.out.println("End");
	}
	
	public static double h(double x)
	{
		return x*x*x*x*x*x*x*x*x*x;
	}
	
	public static double f(double x, double y)
	{
		return x+y;
	}
	
	public static double g(double x, double y, double z)
	{
		return Math.sqrt(x) + Math.abs(y) + Math.pow(z,y);
	}
	
	public static double inputx()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a value for x: ");
		return keyboard.nextDouble();
	}
	
	public static double inputy()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a value for y: ");
		return keyboard.nextDouble();
	}
	
	public static double inputz()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a value for z: ");
		return keyboard.nextDouble();
	}
}
