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
		Scanner ss=new Scanner(System.in);
		int x,y,z;
		x=ss.nextInt();
		y=ss.nextInt();
		z=ss.nextInt();
		if(x>y && x>z)
		{
			System.out.println("x is grater"+x);
		}
		else if(y>x && y>z)
		{
			System.out.println("y is greater"+y);
		}
		else
		{
			System.out.println("z is greater"+z);
		}
		
	}
}
