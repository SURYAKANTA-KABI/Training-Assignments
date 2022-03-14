
package com.cg.projects;
public class Student {
String collegename = "Knowledge University";
String designation = "Student";
public int studentID;
public String[] subjects;
public void name() {
System.out.println("I am a student:");
}
public void printData()
{
System.out.println("College:" +collegename);
System.out.println("Designation:" +designation);
System.out.println("ID:" +studentID);
System.out.println("Subjects:");
for(int i=0; i<subjects.length; i++)
{
System.out.print(subjects[i] + " ");
}
System.out.println();
}
}
