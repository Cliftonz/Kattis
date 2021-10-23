import java.util.*;

public class StuckInATimeLoop{
    public static void main(String[] args0){
        Scanner input = new Scanner(System.in);
        int NumberOfOuputs = input.nextInt();
        for(int i = 0; i< NumberOfOuputs; i++){
            System.out.println((i+1) +" Abracadabra");
        }
    }
}