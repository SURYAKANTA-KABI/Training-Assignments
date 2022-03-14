package com.cg.testprojects;
import com.cg.projects.OnlineStudent;
import com.cg.projects.PartTime;
import com.cg.projects.SpecialOnline;
import com.cg.projects.Student;
public class TestStudent
{
public static void main(String arg[])
{
Student s = new Student();
s.studentID = 1000;
String[] subs = {"History" , "English"};
s.subjects = subs;
System.out.println("Super class output");
s.printData();
System.out.println();
OnlineStudent os = new OnlineStudent();
os.studentID = 1001;
String[] online = {"Programming", "Math", "History", "English"};
os.subjects = online;
int subnumber = online.length;
System.out.println("Online Student Details");
os.print(subnumber);
System.out.println();
PartTime pt = new PartTime();
pt.studentID = 1002;
pt.dayofclass = "Saturday";
pt.timeofclass = "11am to 1pm";
pt.occupation = "Manager";
pt.subjects = subs;
System.out.println("Part time student details");
pt.output();
System.out.println();
SpecialOnline so = new SpecialOnline();
so.studentID = 1003;
so.subjects = online;
System.out.println("Special online student details");
so.print(subnumber);
so.discount();

}
}