package com.codegnan.oopexamples;
import java.util.Scanner;
public class CalculateFine {
	private int bookId;
	private int overDueDays;

	public CalculateFine(int bookId, int overDueDays) {
		super();
		this.bookId = bookId;
		this.overDueDays = overDueDays;
	
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getOverDueDays() {
		return overDueDays;
	}

	public void setOverDueDays(int overDueDays) {
		this.overDueDays = overDueDays;
	}
	public int fineByDays(int overDueDays) {
		return overDueDays*5;	
	}
	public int fixedFine() {
		return 10;
	}
	public int fineByDaysPlusFixed(int overDuesDays) {
		 int  fine =overDuesDays*5+10;
		return Math.min(fine, 1000); 
	}
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bookId = scanner.nextInt();
        int overDueDays = scanner.nextInt();
        int days2 = scanner.nextInt();
        scanner.nextInt(); // Not used
        int days3 = scanner.nextInt();
        CalculateFine fine = new CalculateFine(bookId, overDueDays);
        // Output as per format
        System.out.println(fine.fineByDays(days2));
        System.out.println(fine.fixedFine());
        System.out.println(fine.fineByDaysPlusFixed(days3));
        System.out.println(fine.getBookId());
        System.out.println(fine.getOverDueDays());

        scanner.close();
    }
}

    

