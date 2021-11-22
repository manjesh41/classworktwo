import java.util.*;

public class paliendrom {
    public static void main(String[]args){
        Scanner pa=new Scanner(System.in);
        int value;
        int reminde;
        int division;

        System.out.print("Enter the number:");
        value=pa.nextInt();
        reminde=value%10;
        division=value/10;

        if(reminde==division){
            System.out.print(value+" "+"is a paliendrom");


        }
        else{
            System.out.print(value+" "+"is not a paliendrom" +
                    " ");


        }

    }
}
