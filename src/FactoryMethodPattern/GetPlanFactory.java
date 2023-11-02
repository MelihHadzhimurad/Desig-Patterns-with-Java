package FactoryMethodPattern;

public class GetPlanFactory {

    public Plan getPlan(String planType) {

        planType = planType.toUpperCase();

        return switch (planType) {
            case ("DOMESTICPLAN") -> new DomesticPlan();
            case ("COMMERCIALPLAN") -> new CommercialPlan();
            case ("INSTITUTIONALPLAN") -> new InstitutionalPlan();
            default -> null;
        };
    }
}
