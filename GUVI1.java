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
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		if(num>0)
		{
			System.out.println("positive");
		}
		else if(num<0)
		{
			System.out.println("negative");
		}
		else
		{
			System.out.println("zero");
		}
	}
}
