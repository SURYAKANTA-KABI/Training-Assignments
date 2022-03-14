package com.cg.exception;

public class Course
{
public static void main(String[] args)
{
try
{
int num1 = 10;
int num2 = 0;
System.out.println(num1/num2);
}
catch(Throwable ex)
{
System.out.println("Error within code");
ex.printStackTrace();
}
finally
{
System.out.println("Thanks for using this application");
}
}
}