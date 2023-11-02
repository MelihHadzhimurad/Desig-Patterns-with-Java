package AbstractFactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternExample {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
        String testBankName = bufferedReader.readLine();

        System.out.println();
        System.out.print("Enter the type of loan you want to take, like home loan or bussiness loan or education loan: ");
        String testloanType = bufferedReader.readLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");

        Bank bank = bankFactory.getBank(testBankName);

        System.out.println();
        System.out.print("Enter the interest rate for " + bank.getBankName() + ": ");
        double testRate = Double.parseDouble(bufferedReader.readLine());

        System.out.println();
        System.out.print("Enter the loan amount you want to take: ");
        double testLoanAmount = Double.parseDouble(bufferedReader.readLine());

        System.out.println();
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int testYears = Integer.parseInt(bufferedReader.readLine());

        System.out.println();
        System.out.println("You are taking the loan from " + bank.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");

        Loan loan = loanFactory.getLoan(testloanType);

        loan.getInsterestRate(testRate);
        loan.calculateLoanPayment(testLoanAmount,testYears);
    }
}
