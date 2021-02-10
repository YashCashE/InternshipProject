package io.yash.intern.prac;

public class Calc {
 public static int add(int a,int b) {
	 return a+b;
 }
 public static int mul(int a,int b) {
	 return a*b;
 }
 public static int div(int a,int b) {
	 return a/b;
 }
 public static int mod(int a,int b) {
	 return a%b;
 }
 public static int pow(int a,int b) {
	 for(int i=1;i<=b;i++) {
		 a*=a;
	 }
	 return a;
 }
 public static int sub(int a,int b) {
	 return a-b;
 }
 public static int sq(int a)
 {
	 return a*a;
 }
 public static int sr(int a) {
	 int b=0;
	 for(int i=1;i<a;i++) {
		 if(i*i==a) {
			 b=i;
			 break;
		 }
	 }
	 return b;
 }
 public static boolean ps(int a) {
	 int sum=0;
	 boolean b=true;
	 for(int i=1;i<a;i++) {
		 if(a%i==0) {
			 sum=sum+i;
		 }
	 }
	 if(sum==a) {
		 b=true;
	 }
	 else {
		 b=false;
	 }
	 return b;
 }
}
