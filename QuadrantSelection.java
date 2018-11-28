import java.util.*;
public class QuadrantSelection{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if(x>0 && y>0)
        {
            System.out.print(1);
        }
        if(x>0 && y <0)
        {
            System.out.print(4);
        }
        if(x<0 && y>0)
        {
            System.out.print(2);
        }
        if(x<0 && y<0)
        {
            System.out.print(3);
        }
    }
}