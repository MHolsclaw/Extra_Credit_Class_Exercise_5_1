import java.util.Scanner;
public class Rectangle
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double width, height, perimeter, area;

		System.out.println("Enter the width: ");

		width = keyboard.nextDouble();
		
		System.out.println("Enter the height: ");

		height = keyboard.nextDouble();

		perimeter = 2*(width+height);
		area = width*height;

		System.out.println("The perimeter of the rectangle is " + perimeter + ".");
		System.out.println("The area of the rectangle is " + area + ".");

	}

}
