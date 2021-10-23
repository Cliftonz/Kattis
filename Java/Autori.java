import java.util.*;
public class Autori{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String line = input.next();
        
        System.out.print(line.charAt(0));//output the first letter
        char character = '-';
        int ascii = character;
        for(int i =1; i < line.length(); i++){

            if(line.charAt(i) == ascii){
                System.out.print(line.charAt(i+1));
            }
        }

    }
}