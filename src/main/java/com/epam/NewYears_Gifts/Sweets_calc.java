package com.epam.NewYears_Gifts;

import com.epam.NewYears_Gifts.Chocolates_calc;

public class Sweets_calc extends Chocolates_calc{

	
		  protected int price;
		  protected int quantity;
		  protected String name;
		 
		  public Sweets_calc(String name,int quantity,int price)
		  { super(name,price);
			  
			  this.quantity=quantity;
		  }
		    protected int weight(Sweets_calc sweets[])
		  {
			  int wt=0;
			  for(int i=0;i<sweets.length;i++)
			  {
				  wt+=sweets[i].price;
			  }
			  return wt;
		  }
		}