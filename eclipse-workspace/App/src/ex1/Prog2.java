package ex1;

import java.util.Scanner;

public class Prog2 {
	public static void main(String args[]) {

       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       boolean f=false;
       int a=sc.nextInt();
       if(str.compareToIgnoreCase("Saturday")==0||str.compareToIgnoreCase("Sunday")==0)
       {
    	   if(a>=40)
    		   f=true;
       }
       else
       {
    	   if(a>=40 && a<=60)
    		   f=true;
       }
       System.out.println(f);
    	   sc.close();
    }
}
