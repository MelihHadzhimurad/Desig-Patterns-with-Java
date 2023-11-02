package AbstractFactoryPattern;

public class LoanFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Loan getLoan(String loanType) {

        return switch (loanType.toUpperCase()) {
            case ("HOME") -> new HomeLoan();
            case ("BUSSINESS") -> new BussinessLoan();
            case ("EDUCATION") -> new EducationLoan();
            default -> null;
        };
    }
}
