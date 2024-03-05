package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.taxPayer;
import entities.individual;
import entities.company;

public class program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        List <taxPayer> list = new ArrayList <>();

        for(int i = 1; i <= n; i++){
            System.out.println("TAX PAYER #" + i + " DATA:");
            System.out.print("Individual or company (i/c): ");
            char r = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualRent = sc.nextDouble();

            if (r == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new individual(name, anualRent, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                Integer employeesQuantity = sc.nextInt();
                list.add(new company(name, anualRent, employeesQuantity));
            }
        }
        System.out.println("TAXES PAID:");
        Double sum=0.0;

        for(taxPayer c: list){
            System.out.println(c.name + ": $ " + String.format("%.2f", c.tax()));
            sum += c.tax();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
     sc.close();   
    }
}