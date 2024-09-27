package app;

import java.util.Scanner;

public class Solution {
    public static void main(String[]args){

        Scanner manual = new Scanner(System.in);
        System.out.println("Enter sum of your salary:");
        int salary = manual.nextInt();
        double tax1 = 0.025;
        double tax2 = 0.043;
        double tax3 = 0.067;
        double taxRes1 = salary * tax1;
        double taxRes2 = salary * tax2;
        double taxRes3 = salary * tax3;

        if(salary>0 && salary<=10000) {
            System.out.printf("Your tax is:  %.2f UAN", taxRes1);
        }
        else if (salary>10000 && salary<=25000) {
            System.out.printf("Your tax is:  %.2f UAN", taxRes2);

        }
        else if (salary>25000) {
            System.out.printf("Your tax is:  %.2f UAN", taxRes3);

        }
        else {
            System.out.println("You may not to pay a tax.");
        }


    }
}
