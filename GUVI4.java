/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main(String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner hh=new Scanner(System.in);
		char ch=hh.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println("given string i alpha");
		}
		else
		{
			System.out.println("th given string is not alphabet ");
		}
	}
}
