import java.util.*;

public class Filip{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int b = input.nextInt();

        int aR[] = new int[3];
        int mult = 100;
        for(int i =0; i < 3 ; i++){
            aR[i] = a % 10;
            aR[i] *= mult;
            mult/= 10;
            a /= 10;
        }
        
        for(int i =0; i < 3 ; i++){
        
            a += aR[i];
        
        }

        mult = 100;
        for(int i =0; i < 3 ; i++){
            aR[i] = b % 10;
            aR[i] *= mult;
            mult/= 10;
            b /= 10;
        }
        
        for(int i =0; i < 3 ; i++){
        
            b += aR[i];
        
        }

        if(a>b){
            System.out.print(a);
        }
        else{
            System.out.print(b);
        }
        
    }
}