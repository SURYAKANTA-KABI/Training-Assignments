package com.cg.projects;



public class SpecialOnline extends OnlineStudent {
double discountrate = 0.3;



public void name() {
System.out.println("My name is special online student");
}

public void discount()
{
double newtotal = total - (total*discountrate);
System.out.println("Discounted rate" +newtotal);
}



}