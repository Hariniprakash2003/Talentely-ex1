package Test;

import java.util.Scanner;

public class main5 {

	public static void main(String[] args) {
		System.out.println(sumOfPrime(inputArray()));

	}
	static int [] inputArray()
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the Size :");
		int n=Integer.parseInt(in.nextLine());
		int a[]=new int[n];
		for(int i=0;i<n;i++) 
			a[i]=Integer.parseInt(in.nextLine());
		
		return a;
	}
	
	static boolean prime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i == 0) return false;
		return true;
	} 
	
	static int sumOfPrime(int a[])
	{
		int min=Integer.MAX_VALUE,sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(prime(a[i]))
			{
				min=Math.min(min, a[i]);
				sum+=a[i];
			}
		}
		return sum-min;
	}
}
