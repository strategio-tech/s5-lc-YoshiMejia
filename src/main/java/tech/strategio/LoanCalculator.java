package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: Calculate remaining balance of loan after 3 months of payments
     * 
     * @param Initial loan amount as an integer
     * @return Remainder of loan (as an integer) after 3 months of payments
     */
    static int getRemainingAmountIn3Months(int amount) {
    	for (int i = 0; i < 3; i++) {
    		amount = amount - amount/10;
    	}
    	return amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println(getRemainingAmountIn3Months(amount));
    }
}
