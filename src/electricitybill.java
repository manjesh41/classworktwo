//Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:​
//
//For first 50 units Rs. 0.50/unit​
//For next 100 units Rs. 0.75/unit​
//For next 100 units Rs. 1.20/unit​
//For unit above 250 Rs. 1.50/unit​
//An additional surcharge of 20% is added to the bill

import java.util.Scanner;

public class electricitybill {
    public static void main(String[]args){
        Scanner bill= new Scanner(System.in);

        int userUnit;
        double costOfelectricity;
        double unitCost;

        System.out.print("enter the user unit of electricity:");
        userUnit=bill.nextInt();

        if(userUnit<=50){
            unitCost=0.50;
            costOfelectricity=userUnit*unitCost;
            System.out.print(costOfelectricity+" "+" is the bill of electricity");

        }
        else if((userUnit>50)&&(userUnit<=100)){
            unitCost=0.70;
            costOfelectricity=userUnit*unitCost;
            System.out.print(costOfelectricity+" "+" is the bill of electricity");

        }
        else if((userUnit>100)&&(userUnit<=250)){
            unitCost=1.20;
            costOfelectricity=userUnit*unitCost;
            System.out.print(costOfelectricity+" "+" is the bill of electricity");

        }
        else if(userUnit>250){
            unitCost=1.50;
            costOfelectricity = unitCost*userUnit;
            System.out.print(costOfelectricity+" "+" is the bill of electricity");

        }
    }





}
