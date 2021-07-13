package Ang;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		n= n % 2==0? n-1:n;
		int count=1;
		int result=1;
		while(count<=n)
		{if(count<n)
		{ 
			System.out.print(result+", ");
		}else
			{
			System.out.print(result);
			}
			result+=2;
	     	count++;
		}
	}
}
