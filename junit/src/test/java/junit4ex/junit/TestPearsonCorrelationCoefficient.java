package junit4ex.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestPearsonCorrelationCoefficient {
	
	double arrayX[] = {10, 20, 30, 40, 50};
	double arrayY[] = {50, 100, 150, 200, 250};
	double value1 = 31.62;
	double value2 = 158.11;
	
	@Test
	public void testAddition()
	{
		double actualForArrayX = PearsonCorrelationCoefficient.addition(arrayX);
		
		Assert.assertEquals("Testing for addition of all element of array",150.0,actualForArrayX);
			
	}
	
	@Test
	public void testMeanOfArray()
	{
		double actualForArrayX = PearsonCorrelationCoefficient.meanOfArray(arrayX);
		
		Assert.assertEquals("Testing for mean of all element of array",30.0,actualForArrayX);
		
	}
	
	@Test
	public void testDeviation()
	{
		double actualForArrayX[] = PearsonCorrelationCoefficient.deviation(arrayX);
		
		assertArrayEquals("Testing for deviation of all element of array",new double[]{-20.0,-10.0,0,10.0,20.0},actualForArrayX,0);
		
	}
	
	@Test
	public void testMultiplicationOfArray()
	{
		double actualForArray[] = PearsonCorrelationCoefficient.multiplicationOfArray(arrayX,arrayY);
		assertArrayEquals("Testing for multiplication Of Array of all element of arrayX",new double[]{2000.0,500.0,0,500.0,2000.0},actualForArray,0);
	}
	
	@Test
	public void testSimpleMultiplication()
	{
		double actualForArray = PearsonCorrelationCoefficient.simpleMultiplication(value1,value2);
		Assert.assertEquals("Testing for simple multiplication",4999.4382000000005,actualForArray);
	}
	
	@Test
	public void testimpleDivision()
	{
		double actualForArray = PearsonCorrelationCoefficient.simpleDivision(value2,value1);
		Assert.assertEquals("Testing for simple division",5.0003162555344725,actualForArray);
	}
}
