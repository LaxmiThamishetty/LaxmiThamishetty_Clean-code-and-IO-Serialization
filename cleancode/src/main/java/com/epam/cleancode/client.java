package com.epam.cleancode;

import java.util.Scanner;


public class client {
	public static void main(String args[]){		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for simple and compound interest 2 for house construction cost");
		int choice = sc.nextInt(); 		
		if(choice == 1){
			double principle, rate, time;
			System.out.println("Enter amount");
			principle=sc.nextDouble();
			System. out. println("Enter the No.of years:");
			time=sc.nextDouble();
			System. out. println("Enter the Rate of  interest");
			rate=sc.nextDouble();
			SimpleCompoundInterest simplecompoundinterest = new SimpleCompoundInterest();
			double simple = simplecompoundinterest.simpleInterestCalculation(principle,rate,time);
			double compound = simplecompoundinterest.compoundInterestCalculation(principle,rate,time);
			System.out.println(simple);
			System.out.println(compound);
		}else{
			houseconstruction housecost = new houseconstruction();
			System.out.println("Enter 1)standard materials 2)above standard materials 3)high standard material 4)high standard material and fully automated home");
			int material = sc.nextInt();
			System.out.println("enter total area");
			double totalarea = sc.nextDouble();
			double cost = housecost.constructionCostCalculation(material,totalarea);
			System.out.println(cost+"INR");
			
		}
	}
}
