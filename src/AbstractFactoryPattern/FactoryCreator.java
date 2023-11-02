package AbstractFactoryPattern;

public class FactoryCreator {

    public static AbstractFactory getFactory(String choice) {

        return switch (choice.toUpperCase()) {
            case ("BANK") -> new BankFactory();
            case ("LOAN") -> new LoanFactory();
            default -> null;
        };
    }
}
