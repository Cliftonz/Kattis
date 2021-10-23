import java.util.*;
public class TakeTwoStone{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        if(in.nextInt() % 2 == 1){
            System.out.print("Alice");
        }
        else{
            System.out.print("Bob");
        }
        in.close();
    }
}