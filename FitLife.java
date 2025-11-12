package com.codegnan.oopexamples;
import java.util.Scanner;
public class FitLife {
	private int memberId;
	private int steps;
		
	public FitLife(int memberId, int steps) {
		super();
		this.memberId = memberId;
		this.steps = steps;
	}

	
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}
	public int calcFromSteps(int steps) {
		int calories=(int)(steps*0.05);
		return calories;
		
	}
	public int calcFixed() {
        return 10;
	}
	public int calcStepsPlusFixed(int steps) {
		int calories=(int)(steps*0.05+10);
		return Math.min(calories, 1000); 
	}
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int memberId=scanner.nextInt();
	        int steps = scanner.nextInt();
	        int steps2 = scanner.nextInt();
	         scanner.nextInt(); // for calcFixed()
	        int steps3 = scanner.nextInt();

		FitLife life=new FitLife(memberId,steps);
		System.out.println(life.calcFromSteps(steps2));
		System.out.println(life.calcFixed());
		System.out.println(life.calcStepsPlusFixed(steps3));
		System.out.println(life.getMemberId());
		System.out.println(life.getSteps());
		scanner.close();

	}

}
