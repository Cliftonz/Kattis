import java.util.*;
public class QualityAdjustedLY{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numOfPeriods = input.nextInt();
        double accQALY = 0;
        for(int i =0;i < numOfPeriods; i++ ){

            double quality = input.nextDouble();
            double years = input.nextDouble();
            accQALY += quality *years;

        }
    
        System.out.print(accQALY);
    }
}