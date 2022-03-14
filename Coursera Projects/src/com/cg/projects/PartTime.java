package com.cg.projects;



public class PartTime extends Student{
public String dayofclass;
public String timeofclass;
public String occupation;



public void output()
{
printData();
System.out.println("Day of class :" +dayofclass);
System.out.println("Time of class :" +timeofclass);
System.out.println("Occupation :" +occupation);
}
}