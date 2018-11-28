import java.util.*;

public class LastFactorialDigit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numTests = input.nextInt();
        for(int i = 0; i< numTests; i++){

            int num = input.nextInt();
            int cal=1;
            for(int k = 2; k<= num; k++){
                cal *= k;
            }
            System.out.println( cal % 10);
        }
    }
}