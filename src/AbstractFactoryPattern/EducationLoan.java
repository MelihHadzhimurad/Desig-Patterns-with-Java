package AbstractFactoryPattern;

public class EducationLoan extends Loan{
    @Override
    void getInsterestRate(double r) {
        rate=r;
    }
}
