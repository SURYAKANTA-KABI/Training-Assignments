package com.cg.projects;



public class OnlineStudent extends Student{
String platform = "Coursera";
double costpersubject = 9.99;
double total = 0.0;



public void name() {
System.out.println("I am a online student:");
}



public void print(int num) {
super.name();
name();
printData();
System.out.println("Online platform :" +platform );
total = costpersubject*num;
System.out.println("Total learning cost :" +total );
}
}