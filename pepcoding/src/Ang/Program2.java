package Ang;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int result=1;
		int count=1;
		while(count<=n)
		{
			if(count<n) 
			{
				System.out.print(result+",");
			}
			else{
				System.out.print(result);
				}
			
			result+=2;
			count++;
		}

	}

}
