package Test;
import java.util.*;
public class main3 {

	public static void main(String[] args) {
		
			System.out.println(Arrays.toString(computeString(inputArray())));
	}
	
	//Input Function
	static int [] inputArray()
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the Size :");
		int n=Integer.parseInt(in.nextLine());
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=Integer.parseInt(in.nextLine());
		
		return a;
	}
	//Finds the Length of the element
	static int length(int a)
	{
		int c=0;
		while(a>0)
		{
			c++;
			a/=10;
		}
		return c;
	}
	//Compute String based on condition
	static String [] computeString(int a[])
	{
		
		String out[]=new String[a.length];
		for(int i=0;i<a.length;i++)
		{
			String r="";
			int n=length(a[i]);
			r+=(n == 6) ? "C" : "W";
			r+=(n == 0) ? "Z" : (n == 1) ? "O" : "";
			r+=(prime(a[i])) ? "P" : "N";
			r+=digitSum(a[i]);
			r+=(a[i]%2 == 0) ? (a[i]/2) :((a[i]-1)/2);
			
			out[i]=r;
			
		}
		
		return out;
	}
	//Check for prime
	static boolean prime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i == 0) return false;
		return true;
	} 
	//Compute the Sum of digits
	static int digitSum(int a)
	{
		int sum=0;
		while(a>0)
		{
			sum+=(a%10);
			a/=10;
		}
		return (sum > 9) ? digitSum(sum) : sum;
	}
	
}
