import java.util.*;

public class Change 
{
	static Scanner input = new Scanner(System.in);

	//instance variables
	private String name;//The String name
	private int coinChangeAmount;//The int coinChangeAmount
	
	//default constructor
	public Change() 
	{
        name = "None";
        coinChangeAmount = 0;
	}
	
	//constructor with 2 parameters
	//created an object with a String name and int coinChangeAmount
	//coinChangeAmount must be valid (true), else set to default value
	public Change(String name, int coinChangeAmount) 
	{
		this.name = name;
		if(checkCoinValue(coinChangeAmount)) 
		{this.coinChangeAmount = coinChangeAmount;}
	}

	//setter method for coinamount
	public void setCoinAmount(int coinChangeAmount) 
	{
		//check for valid coinChangeAmount - true, if not valid - set to default value 0
		if(checkCoinValue(coinChangeAmount)) 
		{this.coinChangeAmount = coinChangeAmount;}
	}

    //setter method for name
	public void setName(String name) 
	{this.name = name;}

	//getter method for name
	public String getName() 
	{return name;}

	//getter method for coinamount
	public int getCoinAmount() 
	{return coinChangeAmount;}

	//check for valid coin amount - return true if valid else false
	public static boolean checkCoinValue(int amount) 
	{
		boolean valid = false;		
		if((amount >= 5) && (amount <= 200) && (amount % 5 == 0)) 
		{valid = true;}
		return valid;
	}
	
	//calculate coin change denomination for Change object
	public int[] getChange()
	{
		//create an array to store the coin denomination
		int[] changeToReturn = new int[6];
		//running ballance
		int tempCoinAmount = coinChangeAmount;
		
		changeToReturn[0] = 0;//no of $2 
		changeToReturn[1] = 0;//no of $1 
		changeToReturn[2] = 0;//no of 50 cents
		changeToReturn[3] = 0;//no of 20 cents
		changeToReturn[4] = 0;//no of 10 cents
		changeToReturn[5] = 0;//no of 5 cents
		
		while((double) tempCoinAmount >= 200) 
		{
			//balace minus 200
			tempCoinAmount -= 200;
			//coin denomination increase by 1 each time
			changeToReturn[0] ++;
		}
	
		while((double) tempCoinAmount >= 100) 
		{
			tempCoinAmount -= 100;
			changeToReturn[1] ++;
		}
		
		while((double) tempCoinAmount >= 50) 
		{
			tempCoinAmount -= 50;
			changeToReturn[2] ++;
		}
		
		while((double) tempCoinAmount >= 20 ) 
		{
			tempCoinAmount -= 20;
			changeToReturn[3] ++;
		}
		
		while((double) tempCoinAmount >= 10) 
		{
			tempCoinAmount -= 10;
			changeToReturn[4] ++;
		}
		
		while((double) tempCoinAmount >= 5) 
		{
			tempCoinAmount -= 5;
			changeToReturn[5] ++;
		}
		return changeToReturn;
	}
	
	//description/output of each coin denomination 
	public static void coinDenominationDescription(int[] array, int index){
		switch(index) 
		{
		    case 0: System.out.println("2 dollars: " + array[0]);
			    break;
		    case 1: System.out.println("1 dollar : " + array[1]);
			    break;
		    case 2: System.out.println("50 cents : " + array[2]);
			    break;
		    case 3: System.out.println("20 cents : " + array[3]);
			    break;
		    case 4: System.out.println("10 cents : " + array[4]);
			    break;
		    case 5: System.out.println("5 cents  : " + array[5]);
			    break;
		}
	}	
	
	//display final output of each coin change denomination
	public static void displayChange(Change ch) 
	{
		//declare array size
		int	[] change = new int[6];
		//call getChange method and store in array change
		change = ch.getChange();
		System.out.println("========< Change >======== ");
		for(int idx = 0; idx < change.length;idx++) 
		{
			//print the coin denomination with value only
			if(change[idx] > 0) 
			{coinDenominationDescription(change, idx);}
		}
		System.out.println("========================== ");
	}
		
	//add passed in coin amount to the existing coin amount
	public void addCoinChangeAmount(int coinChangeAmountToAdd) 
	{this.coinChangeAmount += coinChangeAmountToAdd;}
		
	//Display the output of MoneyChange object including name and coinChangeAmount
	public void display() 
	{
		System.out.println("Name:"+name);
		System.out.println("CoinChangeAmount:"+coinChangeAmount);
	}
}//end of MoneyChange class
