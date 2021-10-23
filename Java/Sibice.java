import java.util.*;

public class Sibice{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int NofMatches = in.nextInt();
        int HofBox = in.nextInt();
        int WofBox = in.nextInt();
        double maxLenghtofB = Math.sqrt((HofBox*HofBox)+(WofBox*WofBox));
        for(int i=0; i < NofMatches; i++){
            int matchLength = in.nextInt();
            if(matchLength <= maxLenghtofB){
                System.out.println("DA");
            }
            else
            {
                System.out.println("NE");
            }
        }
        in.close();
    }
}