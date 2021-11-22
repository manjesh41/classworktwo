//Write a program to input basic salary of an employee and calculate its Gross salary according to following:​
//
//Basic Salary <= 10000 : HRA = 20%, DA = 80%​
//Basic Salary <= 20000 : HRA = 25%, DA = 90%​
//Basic Salary > 20000 : HRA = 30%, DA = 95%

import java.util.Scanner;

public class FindGrossSalary {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int basicSalary;
        int HRA;
        int DA;
        int grossSalary;


        System.out.print("Enter the Basic Salary:");
        basicSalary=sc.nextInt();



        if(basicSalary<=10000){
            HRA=20*(basicSalary/100);
            DA=80*(basicSalary/100);
            grossSalary = basicSalary+HRA+DA;
            System.out.print(grossSalary+" "+"is the salary of employee");


        }
        if(basicSalary<=20000){
            HRA=25*(basicSalary/100);
            DA=90*(basicSalary/100);
            grossSalary = basicSalary+HRA+DA;
            System.out.print(grossSalary+" "+"is the salary of employee");


        }  if(basicSalary>20000){
            HRA=30*(basicSalary/100);
            DA=95*(basicSalary/100);
            grossSalary = basicSalary+HRA+DA;
            System.out.print(grossSalary+" "+"is the salary of employee");


        }

    }
}
