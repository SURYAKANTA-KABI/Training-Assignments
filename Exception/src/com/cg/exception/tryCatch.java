package com.cg.exception;
import java.util.Scanner;

public class tryCatch {

public static void main(String[] args)
{
try
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number one");
int num1 = scanner.nextInt();
System.out.println("Enter number two");
int num2 = scanner.nextInt();
System.out.println(num1+num2);
}
catch(Throwable ex)
{
System.out.println("Value has to be an integer");
}
}

}