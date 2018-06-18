package com.sindhu.cmpe202;

public class GumballMachine {
	
	private int num_gumballs;
    private boolean has_sufficientcoins;
    private int No_of_coins;
    private int Machine_no;

    public GumballMachine( int size )
    {
        // initialize instance variables
        this.num_gumballs = size;
        this.has_sufficientcoins=false;
        this.No_of_coins=0;    
    }
    
    public void insertCoins(int coin)
    {
    	No_of_coins=coin;
    	this.Machine_no=1;
    	
    	if ( coin == 25 )
          this.has_sufficientcoins = true ;
       else 
         this.has_sufficientcoins = false ;
    }
    
    public void insertCoins(int coin1, int coin2)
    {
    	No_of_coins= coin1+coin2;
    	this.Machine_no=2;
    	
    	if(coin1 == 25 && coin2 == 25)
    		this.has_sufficientcoins=true;
   	else
   			this.has_sufficientcoins= false;
    }
    
    public void insertCoins(int[] coins)
    {
    	this.Machine_no=3;
    	for(int i=0;i<coins.length;i++)
    		No_of_coins+=coins[i];
    	
    	if(No_of_coins>=50)
    		this.has_sufficientcoins=true;
    	else
    		this.has_sufficientcoins=false;			
    }

    
    public void turnCrank()
    {
    	if (this.has_sufficientcoins)
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_sufficientcoins=false;
    			System.out.println( "Thanks for your "+ No_of_coins +" cents."+ " Gumball Ejected!" ) ;
    			
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your " + No_of_coins + "." ) ;
    		}
    	}
    	else 
    	{
    		if(Machine_no==1)
    			System.out.println( "Insufficient coins..Please insert a quarter" ) ;
    		
    		else if(Machine_no==2)
    			System.out.println( "Insufficient coins..Please insert two quarters" ) ;
    		
    		else if(Machine_no==3)
    			System.out.println( "Insufficient coins..Please insert 50 cents" ) ;
    	}  
    	this.No_of_coins=0;
    }
    
}
