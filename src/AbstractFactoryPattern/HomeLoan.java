package AbstractFactoryPattern;

public class HomeLoan extends Loan{
    @Override
    void getInsterestRate(double r) {
        rate=r;
    }
}
