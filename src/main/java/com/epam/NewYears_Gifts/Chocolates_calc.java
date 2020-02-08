package com.epam.NewYears_Gifts;

public class Chocolates_calc {

	
	  public String name ;
	  public int price;
	  
	  public Chocolates_calc(String name,int price)
	  {
		  this.name=name;
		  this.price=price;
	  }
	   protected int weight(Chocolates_calc chocolates[])
	  {
		  int weight=0;
		  int n = chocolates.length;
		  for(int i=0;i<n;i++)
		  {
			  weight = weight+(chocolates[i].price);
	
		  }
		  return weight;
	  }
	}