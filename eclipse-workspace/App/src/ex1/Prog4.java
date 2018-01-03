package ex1;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prog4 {
	static int a[] = new int[100];
	static int ct = 0;

	public static void rec(int l) {

		if (a[l] == 11)
			ct++;
		if (l == 0)
			System.out.println(ct);
		else {
			l--;
			rec(l);
		}

	}

	public static void main(String args[]) throws InputMismatchException {

		Scanner sc = new Scanner(System.in);
		int i, n;
		n = sc.nextInt();
		for (i = 0; i < n; i++) {
			try {
			a[i] = sc.nextInt();}
catch(Exception e)
{
System.out.println("Integer only");
return ;
}
		}
		rec(n - 1);
		sc.close();

	}
	// meaningful
	// camelcase
	// modules
	// format
	//line lenght
	//comments
	//ctrl shift f
	//constants
	//logs print not sys println
//date and string functions
}
