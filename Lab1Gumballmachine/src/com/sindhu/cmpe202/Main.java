package com.sindhu.cmpe202;

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(4);

		System.out.println(gumballMachine);
		
		System.out.println("From Gumball Machine 1");
		gumballMachine.insertCoins(25);
		gumballMachine.turnCrank();
		
		System.out.println("From Gumball Machine 2");
		gumballMachine.insertCoins(25,25);
		gumballMachine.turnCrank();
		
		System.out.println("From Gumball Machine 3");
		int[] coinList1= {10,10,5,5,5,5,10};
		gumballMachine.insertCoins(coinList1);
		gumballMachine.turnCrank();
		
		System.out.println("From Gumball Machine 3");
		int[] coinList2= {10,10,5,5,5,5};
		gumballMachine.insertCoins(coinList2);
		gumballMachine.turnCrank();
		
		System.out.println("From Gumball Machine 1");
		gumballMachine.insertCoins(25);
		gumballMachine.turnCrank();
		
		System.out.println("From Gumball Machine 1");
		gumballMachine.insertCoins(25);
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
	}
}
