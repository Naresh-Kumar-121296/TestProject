package Ang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String rs="";
	int n = sc.nextInt();
	int []arr= new int[n];
	for (int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
     List<String>result=new ArrayList<String>();
     for(int i=1;i<=9;i++)
     {
    	 int count=0;
    	 for(int j=0;j<arr.length;j++)
    	 {
    		 if(arr[j]%i==0)
    		 {
    			 count++;
    		 }
    	 }
    	 rs=i+":"+count;
    	 result.add(rs);
     }
     System.out.println(result);
	}

}
