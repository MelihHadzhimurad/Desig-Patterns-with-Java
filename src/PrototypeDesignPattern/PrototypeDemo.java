package PrototypeDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter employee Id: ");
        int eid = Integer.parseInt(bufferedReader.readLine());
        System.out.println();

        System.out.print("Enter employee name: ");
        String ename = bufferedReader.readLine();
        System.out.println();

        System.out.print("Enter employee Designation: ");
        String edesignation = bufferedReader.readLine();
        System.out.println();

        System.out.print("Enter employee Salary: ");
        double salary = Double.parseDouble(bufferedReader.readLine());
        System.out.println();

        System.out.print("Enter employee adress: ");
        String eadress = bufferedReader.readLine();
        System.out.println();

        EmployeeRecord emp1 = new EmployeeRecord(eid,ename,edesignation,salary,eadress);
        emp1.showRecord();

        EmployeeRecord emp2 = (EmployeeRecord) emp1.getClone();
        emp2.showRecord();
    }
}
