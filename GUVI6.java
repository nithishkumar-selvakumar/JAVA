/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner aa=new Scanner(System.in);
		long year=aa.nextInt();
		if(year%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
	}
}
