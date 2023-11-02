package AbstractFactoryPattern;

public class BankFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bankName) {

        return switch (bankName.toUpperCase()) {
            case ("HDFC") -> new HDFC();
            case ("ICICI") -> new ICICI();
            case ("SBI") -> new SBI();
            default -> null;
        };
    }

    @Override
    public Loan getLoan(String loanType) {
        return null;
    }
}
