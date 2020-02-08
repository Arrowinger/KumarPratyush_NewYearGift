package com.epam.NewYears_Gifts;



import java.util.* ;
import com.epam.NewYears_Gifts.Chocolates_calc;
import com.epam.NewYears_Gifts.Sweets_calc;


public class Gifts extends Sweets_calc{
	private static String name;
	private static int price;
	private static int quantity;
	Sweets_calc sweets[];
	   Chocolates_calc chocolates[];
	   int weight;
	   Scanner sc = new Scanner(System.in);
	  
	   public Gifts(Sweets_calc sweet[],Chocolates_calc chocolates[])
	   
	   { super(name, price, quantity);
		  sweets=sweet;
		  this.chocolates=chocolates;
		  weight=0;
	   }
	   void sortChoco()
	   {	
		  
		   int n=sweets.length;
		   for(int i=0;i<n-1;i++)
		   {
			   for(int j=0;j<n-i; j++)
			   {
				   if(chocolates[j].price>chocolates[j+1].price)
				   {
					   Chocolates_calc x;
					   x=chocolates[j];
					   chocolates[j]=chocolates[j+1];
					   chocolates[j+1]=x;
				   }
			   }
		   }
	   }
	   void findCandies()
		{	
		   System.out.println("Enter the cost upto which the number of candies has to be found : ");
		   int numcandies = sc.nextInt();
		   System.out.println("Candies in the Children's Gift whose cost is less than "+numcandies+" is:");
			for(int i=0;i<chocolates.length;i++)
			{
				if(chocolates[i].price>=numcandies)
				{
					break;
				}
				System.out.println("Name:"+chocolates[i].name);
				System.out.println("Cost:"+chocolates[i].price);
			}
		}
	   void findWeight()
	   {
		    weight=weight(sweets)+weight(chocolates);
			System.out.println("Total weight of Gift is :"+weight);
	   }
	   
	}