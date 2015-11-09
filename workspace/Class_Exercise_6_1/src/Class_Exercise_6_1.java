//Calculator Driver
public class Class_Exercise_6_1 
{
	public static void main(String[] args)
	{
		double [] numArray = new double [5];
		numArray[0]=5.0;
		numArray[1]=10.0;
		numArray[2]=15.0;
		numArray[3]=20.0;
		numArray[4]=25.0;
		
/*		int [] factArray = new int [5];
		factArray[0]=1;
		factArray[1]=2;
		factArray[2]=3;
		factArray[3]=4;
		factArray[4]=5;*/
		
		System.out.println("Array sum is " + Calculator.getSum(numArray));
		System.out.println("Array average is " + Calculator.getAverage(numArray));
		System.out.println("Array product is " + Calculator.getProduct(numArray));
		System.out.println("Array length factorial is " + Calculator.getFactorial(numArray));
	}
}
