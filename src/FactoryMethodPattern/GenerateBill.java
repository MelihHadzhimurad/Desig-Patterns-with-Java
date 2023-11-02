package FactoryMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

    public static void main(String[] args) {

        GetPlanFactory getPlanFactory = new GetPlanFactory();

        System.out.println("Enter the name of plan for which the bill will be generated: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String planName = null;
        try {
            planName = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Something wrong!");
        }

        System.out.println("Enter the number of units for bill will be calculated:");

        int units = 1;

        try {
            units = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Something wrong!");
        }

        Plan plan = getPlanFactory.getPlan(planName);

        System.out.print("Bill amount for " + planName + " of " + units + " units is: ");
        plan.getRate();
        plan.calculateBill(units);
    }
}
