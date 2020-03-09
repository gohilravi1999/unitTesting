package junit4ex.junit;

public class PearsonCorrelationCoefficient {
	
	public static double addition(double array[])
	{
		double sum=0;
		for(double elementOfArray : array)
		{
			sum=sum+elementOfArray;
		}
		return sum;
	}
	
	public static double meanOfArray(double array[])
	{
		return addition(array)/array.length;
	}
	
	public static double[] deviation(double array[])
	{
		int count = 0;
		double deviatedArray[] = new double[array.length];
		for(double elementOfArray : array)
		{
			deviatedArray[count] = elementOfArray - meanOfArray(array); 
			count++;
		}
		return deviatedArray;
	}
	
	public static double[] multiplicationOfArray(double array1[], double array2[])
	{
		int count = 0;
		double tempArray1[] = deviation(array1);
		double tempArray2[] = deviation(array2);
		double multipliedArray[] = new double[array1.length];
		for(double elementOfArray : tempArray1)
		{
			multipliedArray[count] = elementOfArray*tempArray2[count]; 
			count++;
		}
		return multipliedArray;
	}
	
	public static double simpleMultiplication(double value1, double value2)
	{
		return value1*value2;
	}
	
	public static double simpleDivision(double numerator, double denominator)
	{
		return numerator/denominator;
	}
	
}
