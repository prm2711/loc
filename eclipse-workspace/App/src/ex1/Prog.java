package ex1;

import java.util.Scanner;

public class Prog {
	public static void main(String args[]) {
        int sum=0,flag=0;
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       for(int i=0;i<str.length();i++){
           if(Character.isDigit(str.charAt(i)))
           {
               flag=1;
               sum=sum+Character.getNumericValue(str.charAt(i));
           }
       }
       if(flag==1)
       System.out.println(sum);
       else
       System.out.println(0);
       sc.close();
    }
}
