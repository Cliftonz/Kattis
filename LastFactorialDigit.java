import java.util.*;

public class LastFactorialDigit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numTests = input.nextInt();
        /*for(int i = 0; i< numTests; i++){

            int num = input.nextInt();
            int cal=1;
            for(int k = 2; k<= num; k++){
                cal *= k;
            }
            System.out.println( cal % 10);
        }*/

        switch(numTests){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("6");
                break;
            default:
                System.out.println("0");
                break;
        }
    }
}