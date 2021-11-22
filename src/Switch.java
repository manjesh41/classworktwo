import java.util.Locale;
import java.util.Scanner;

public class Switch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the character:");
        char chr=sc.next().toLowerCase().charAt(0);
        switch (chr){
            case 'a':
                System.out.print("vowel");
                break;
            case 'e':
                System.out.print("vowel");
                break;
            case 'i':
                System.out.print("vowel");
                break;
            case 'o':
                System.out.print("vowel");
                break;

            case 'u':
                System.out.print("vowel");
            default:
                System.out.print("consolent");
                break;
        }

    }
}
