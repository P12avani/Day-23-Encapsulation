package com.codegnan.oopexamples;
import java.util.Scanner;
public class PetFoodCost {
	private int petId;
	private int quantity;
	
	public PetFoodCost(int petId, int quantity) {
		super();
		this.petId = petId;
		this.quantity = quantity;
	}
	
	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int computeCostByQuantity(int q) {
		int cost=q*2;
		 return Math.min(cost, 1000);
	}
	public int computeFixedCost() {
		return 15;
	}
	 public int computeQuantityPlusFixed(int q) {
		 int cost= q*2 + 15;
		 return Math.min(cost, 1000);
	 }
	 

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int petId=scanner.nextInt();
		int quantity=scanner.nextInt();
		int quantity2=scanner.nextInt();
		scanner.nextInt();
		int quantity3=scanner.nextInt();
		
		PetFoodCost pet=new PetFoodCost( petId, quantity);
		System.out.println(pet.computeCostByQuantity(quantity2));
		System.out.println(pet.computeFixedCost());
		System.out.println(pet.computeQuantityPlusFixed(quantity3));
        System.out.println(pet.getPetId());
        System.out.println(pet.getQuantity());
        scanner.close();
			
		}

	}


