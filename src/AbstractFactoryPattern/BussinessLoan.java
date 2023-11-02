package AbstractFactoryPattern;

public class BussinessLoan extends Loan{
    @Override
    void getInsterestRate(double r) {
        rate=r;
    }
}
