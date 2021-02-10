package io.yash.intern.prac;
import java.util.*;
public class Main {
	public static void main(String Args[]) {
		Scanner sc=new Scanner(System.in);
		Calc c=new Calc();
		System.out.println("Welcome to Local Calculator");
		System.out.println("Enter Value of a");
		int a=sc.nextInt();
		System.out.println("Enter Value of b");
		int b=sc.nextInt();
		int add=c.add(a, b);
		int sub=c.sub(a, b);
		int mul=c.mul(a, b);
		int mod=c.mod(a, b);
		int div=c.div(a, b);
		int sq=c.sq(a);
		int sr=c.sr(a);
		boolean b1=c.ps(a);
		System.out.println("Addition of "+a+" and "+b+" is: "+add);
		System.out.println("Subtraction of "+a+" and "+b+" is: "+sub);
		System.out.println("Multiplication of "+a+" and "+b+" is: "+mul);
		System.out.println("Division of "+a+" and "+b+" is: "+div);
		System.out.println("Modulus of "+a+" and "+b+" is: "+mod);
		System.out.println("Square Root of "+a+" is: "+sr);
		System.out.println("Square Value of "+a+" is: "+sq);
		if(b1) {
			System.out.println(a+" is an Perfect Number");
		}
		else {
			System.out.println(a+" is not  an Perfect Number");
		}
		
	}

}
