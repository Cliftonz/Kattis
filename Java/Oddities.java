
import java.util.*;

public class Oddities
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int testcase = input.nextInt();
        
        for(int i = 0; i < testcase; i++){

            int numberToCheck = input.nextInt();
            
            boolean isEven = false;

            if(numberToCheck == 0){
                isEven = true;
            }
            else
            {
                for(int k = 0; k < numberToCheck; k++)
                {

                    if(2 * k == numberToCheck)
                    {
                        isEven = true;
                        break;
                    }
                }
            }
            if(isEven == true){
                System.out.println(numberToCheck + " is even");
            }
            else {
                System.out.println(numberToCheck + " is odd");
            }
        }

        input.close();
    }
}