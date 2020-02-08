package com.epam.NewYears_Gifts;




//import java.io.*;
import java.util.*;
import com.epam.NewYears_Gifts.Chocolates_calc;
import com.epam.NewYears_Gifts.Sweets_calc;

public class App 
{
    public static void main( String[] args )
    {
      
    	int sweets, chocolates ;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter total of sweets in the gift");
    	sweets=sc.nextInt();
    	Sweets_calc s[]=new Sweets_calc[sweets];
    	for(int i=0;i<sweets;i++)
    	{
    		System.out.println("Enter details of sweets "+(i+1)+":");
    		System.out.println("Name of the sweets:");
    		String sname=sc.next();
    		System.out.println("Quantity of the sweets:");
    		int squantity=sc.nextInt();
    		System.out.println("Price of the sweets:");
    		int sprice=sc.nextInt();
    		s[i]=new Sweets_calc(sname,squantity,sprice);
    	}
    	System.out.println("Input total of chocolates in the gift:");
    	chocolates=sc.nextInt();
    	Chocolates_calc c[]=new Chocolates_calc[chocolates];
    	for(int i=0;i<chocolates;i++)
    	{
    		System.out.println("Enter details of Chocolate "+(i+1)+":");
    		System.out.print("Name:");
    		String cname=sc.next();
    		System.out.print("Price:");
    		int cprice=sc.nextInt();
    		c[i]=new Chocolates_calc(cname,cprice);
    	}
   
    	Gifts gift=new Gifts(s,c);
    	gift.findWeight();
    	
    	gift.findCandies();
    	gift.sortChoco();
    }
}