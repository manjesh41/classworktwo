import java.util.Scanner;
public class MaleAndFemale {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);


        boolean gender;
        int age;

        System.out.print("Gender male? ");
        gender=sc.nextBoolean();


        System.out.print("Enetr the age:");
        age= sc.nextInt();

        if(gender==true){
            if((age==20)&&(age>20)){
                System.out.print("He is a man ");


            }
            else {
                System.out.print("He is a boy");


            }
        }
        else{
            if((age==20)&&(age>20)){
                System.out.print("He is a women ");

            }
            else{
                System.out.print("she is a girl");
            }
        }

    }
}
