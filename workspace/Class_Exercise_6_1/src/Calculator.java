
public class Calculator 
{
	public static double getSum(double [] numArray)
	{
		double sum = 0.0;
		for(int i=0; i<numArray.length; i++)
		{
			sum+=numArray[i];
		}
		return (sum);
	}
	public static double getAverage(double [] numArray)
	{
		double sum = 0.0;
		for(int i=0; i<numArray.length; i++)
		{
			sum+=numArray[i];
		}
		return (sum/numArray.length);
	}
	
	public static double getProduct(double [] numArray)
	{
		double product = 1.0;
		for(int i=0; i<numArray.length; i++)
		{
			product*=numArray[i];
		}
		return (product);
	}
	
	public static int getFactorial(double [] numArray)
	{
		int factorial = 1;
		for(int i=1; i<=numArray.length; i++)
		{
			factorial*=i;
		}
		return (factorial);
	}
	
	
}
