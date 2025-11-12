package com.codegnan.oopexamples;
import java.util.Scanner;
public class TrackDonation {
	private int donateId;
	private int donateAmount;
	
	public TrackDonation(int donateId, int donateAmount) {
		super();
		this.donateId = donateId;
		this.donateAmount = donateAmount;
	}
	
	public int getDonateId() {
		return donateId;
	}

	public void setDonateId(int donateId) {
		this.donateId = donateId;
	}

	public int getDonateAmount() {
		return donateAmount;
	}

	public void setDonateAmount(int donateAmount) {
		this.donateAmount = donateAmount;
	}
	public int computeMatched(int amount) {
		int match=amount*2;
		return Math.min(match,10000);
	}
	public int fixedAmount() {
	return 50;
    }
	public int computeMatchedByPlus(int amount) {
		int match=amount*2+50;
		return Math.min(match, 10000);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int donateId=scanner.nextInt();
		int donateAmount=scanner.nextInt();
		int amount2=scanner.nextInt();
		scanner.nextInt();
		int amount3=scanner.nextInt();
		
		TrackDonation donation=new TrackDonation(donateId,donateAmount);
		System.out.println(donation.computeMatched(amount2));
		System.out.println(donation.fixedAmount());
		System.out.println(donation.computeMatchedByPlus(amount3));
		System.out.println(donation.getDonateId());
        System.out.println(donation.getDonateAmount());
		scanner.close();
	}

}
