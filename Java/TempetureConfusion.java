import java.util.*;

public class TempetureConfusion{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String line = input.next();
        String[] nums = new String[2];

        nums = line.split("/");
        System.out.print(nums[0] + nums[1]);
        String aS = nums[0];
        int a = Integer.parseInt(aS);
        aS = nums[1];
        int b = Integer.parseInt(aS);

        a -= 32;
        
    }
}