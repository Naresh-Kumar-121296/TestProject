package com.naresh.pepcoding;

import java.util.Scanner;

public class Problem22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i < n; i++)
		{
			if(i % 2 == 1)
			{
				for (int j = 1; j <=i; j++) 
					{
					 System.out.print(j+" ");
				    }
			       System.out.println();

		    }
			else {
				for (int j = i; j >=1; j--) {
						System.out.print(j+" ");
					}
	               System.out.println();
				}
		}
		if(n%2==0) 
		{
			for(int j=n;j>1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		else {
			for(int j=1;j<n;j++)
			{
				System.out.print(j+" ");
			}
			 System.out.println();
		  }
		for(int i=n-1;i>1;i--) {
			{
				if(i % 2 == 1)
				{
					for (int j = 1; j <=i; j++) 
						{
						 System.out.print(j+" ");
					    }
				       System.out.println();

			    }
				else {
					for (int j = i; j >=1; j--) {
							System.out.print(j+" ");
						}
		               System.out.println();
					}
			}
			
		}
	}

}
