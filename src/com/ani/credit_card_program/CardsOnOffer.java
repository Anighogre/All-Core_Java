package com.ani.credit_card_program;

public class CardsOnOffer 
{
	public static CardType getOfferedCard(Customer c)
	{
		int cPoint = c.getCreditPints();
		if(cPoint>=100 && cPoint <=500)
		{
			return new CardType(c,"Silver");
		} 
		else if(cPoint>500 && cPoint <=1000)
		{
			return new CardType(c,"Gold");
		}
		else if(cPoint >1000)
		{
			return new CardType(c,"Platinum");
		} 
		else 
		{
			return new CardType(c,"EMI");
		}
	}
}
