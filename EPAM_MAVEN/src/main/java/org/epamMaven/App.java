package org.epamMaven;

import org.epamMaven.Treats.*;

import org.epamMaven.gift.*;



public class App{
    public static void main(String args[]){
        treat s1=new chocolate("Dairy Milk",100,80);
        treat s2=new chocolate("5 Star",200,10);
        treat s3=new chewingGum("Center Fresh",10,80);
        treat s4=new chewingGum("Boomer",15,98);

        Gift gifts=new Gift();

        gifts.add(s1);
        gifts.add(s2);
        gifts.add(s3);
        gifts.add(s4);

        System.out.println(gifts.getWeights());
        System.out.println(gifts.toString());
    }
}