
import java.util.Scanner;

public class Bank_Loan {
    // The Metro Bank provides various types of loans such as car loans, business loans and house loans to its account holders, i.e., customers.

// Implement a program to determine the eligible loan amount and the EMI that the bank can provide to its customers based on their salary and the loan type they expect to avail.
// The values required for determining the eligible loan amount and the EMI are:
// account number of the customer
// account balance of the customer
// salary of the customer
// loan type 
// expected loan amount
// expected no. of EMIs
// The following validations should be performed:
// The account number should be of 4 digits and its first digit should be 1
// The customer should have a minimum balance of $1000 in the account
// Display appropriate error messages if the validations fail.
// If the validations pass, determine whether the bank would provide the loan or not. 
// The bank would provide the loan, only if the loan amount and the number of EMIs expected by the customer is less than or equal to the loan amount and the number of EMIs decided by the bank respectively. The bank decides the eligible loan amount and the number of EMIs based on the below table.
// Display the account number, eligible and requested loan amount and the number of EMIs if the bank provides the loan.
// Display an appropriate message if the bank does not provide the loan.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome into METRO BANK ");

        System.out.println("--------------------");

        long acNumber;
        double AcBal;
        double SAL;
        int LoanType;
        double loan_Amt;
        int EMI;

        System.out.println("Enter your AC Number");
        acNumber = sc.nextLong();

        // Validate account number: 4 digits and first digit is 1
        if (acNumber < 1000 || acNumber > 1999 || acNumber > 65 && acNumber < 120) {
            System.out.println("Invalid account number. It should be a 4-digit number starting with 1.");
            return;
        }

        // account balance
        System.out.println("Enter the Ac Balance ");
        AcBal = sc.nextDouble();
        if (AcBal < 1000) {
            System.out.println("Fund is not sufficient into your Bank Account");
            return;
        }

        // salarry
        System.out.println("Enter your Salary ");
        SAL = sc.nextDouble();
        if (SAL < 25000) {
            System.out.println("sorry you are not Eligible");
            return;
        }

        System.out.println("TYPE OF LOAN : 1 >CAR, 2 -> HOUSE, 3 -> BUSINESS");
        LoanType = sc.nextInt();

        if (LoanType < 1 && LoanType > 3) {
            System.out.println("invalid option entered ");
            return;
        }

        System.out.println("Enter the Expected Loan Amount ");
        loan_Amt = sc.nextDouble();

        if (loan_Amt < 1) {
            System.out.println("invalid amount entered");
            return;
        }

        System.out.println("Enter the Expected no of EMI's you want ?");
        EMI = sc.nextInt();
        if (EMI < 1) {
            System.out.println("invalid emi entered");
        }

        // checking for loan eligibility
        if (LoanType == 1 && EMI <= 36 && loan_Amt <= 500000) {
            System.out.println("you are eligible FOR CAR LOAN Customer !! Happy Banking");
            System.out.println("ACCOUNT NUM " + acNumber + " REQUESTED LOAN AMOUNT IS " + loan_Amt + " Approved loan is 500000 " + "YOUR TOTAL EMI'S IS " + EMI);

        } else if (LoanType == 2 && EMI <= 60 && loan_Amt <= 6000000) {
            System.out.println("YOU ARE ELIGIBLE FOR HOUSE LOAN ");
            System.out.println("ACCOUNT NUM " + acNumber + " REQUESTED LOAN AMT IS " + loan_Amt + " APPROVED LOAN IS 6000000 " + "YOUR TOTAL EMI'S WILL BE " + EMI);
        } else if (LoanType == 3 && EMI <= 84 && loan_Amt <= 7500000) {
            System.out.println("YOU ARE ELIGIBLE FOR BUSINESS LOAN ");
            System.out.println("ACCOUNT NO " + acNumber + "REQUESTED LOAN AMT IS " + loan_Amt + " Approved loan amt is " + EMI);
        } else if (!(LoanType == 2 && EMI <= 60 && loan_Amt <= 6000000)) {
            System.out.println("you are not eligible due to you have not fulfilled the eligibilty criteria ");
        }

    }

}
