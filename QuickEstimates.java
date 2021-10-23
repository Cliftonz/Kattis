import java.util.*;

public class QuickEstimates{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i =0; i < n; i++){

            int number = input.nextInt();
            
            String conNum = Integer.toString(number); 
            
            System.out.println(conNum.length());
        }
    }
}