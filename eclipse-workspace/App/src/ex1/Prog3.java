package ex1;

import java.util.Scanner;

public class Prog3 {
	public static void main(String args[]) {

	       Scanner sc=new Scanner(System.in);
	       int sum=0;
	       int a=sc.nextInt();
	       sum=a;
	       int b=sc.nextInt();
	       int c=sc.nextInt();
	       if(a==b)
	       {
	    	   if(a==c);
	    	   else
	    		   sum+=c;
	       }
	       else
	       {
	    	   sum+=b;
	    	   if(a==c || b==c);
	    	   else sum+=c;
	       }
	       System.out.println(sum);
	    }
}
