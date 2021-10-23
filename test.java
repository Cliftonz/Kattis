
import java.util.Scanner; // Imports scanner into program

public class test {
    public static void main(String[] args) {
        String s = "ERRONEOUS";
        String s1 = s.substring(0,1);
        String s2 = s.substring(1, s.length() - 1);
        String s3 = s.substring(s.length() - 1);
        if (s.length() <= 3)
             System.out.println(s3 + s2 + s1);
        else
             System.out.println((s2) + s3);
        
        System.out.println("-------------------------------------");
        
        s1 = "yours";
        s2 = "Mine";
        if (s1.equalsIgnoreCase(s2)) {
            s3 = s1.toLowerCase();
            System.out.println(s2 + " and " + s3);
        } else {
            s3 = s1.toUpperCase();
            System.out.println(s2 + " and " + s3);
        }

        s = "PictureFraming";
        char x = s.charAt(3);
        System.out.println((int)x);

        System.out.println("-------------------------------------");

        int a = 1; int b = 2;    int c = 3;

        boolean aoeu = 5*b % 3 > b / c % 2;

        int aoeui= (a+b+c)*((a+b)%c);

        //int aoeuii = (a + b + c) / Math.sqrt(c + a) + (a – c);

        System.out.println(aoeu);

        System.out.println(aoeui);

        //System.out.println(aoeuii);

        System.out.println("-------------------------------------");

        int t1 =0,t2 = 0; for( t2 = 2; t2 <= 10; t2 = t2 + 5){ t1 = t2 * 3;}

        System.out.println(t1);
        
        System.out.println(t2);

        System.out.println("-------------------------------------");

        String s0 = "ERRONEOUS";
        String s10 = s0.substring(0,1);
        String s20 = s0.substring(1, s0.length() - 1);
        String s30 = s0.substring(s0.length() - 1);
        if (s0.length() <= 3)
             System.out.println(s30 + s20 + s10);
        else
             System.out.println((s20) + s30);

        System.out.println("-------------------------------------");

        System.out.println("letter");
        String strin = "PictureFraming";
        char xs = strin.charAt(3);
        System.out.println((int)xs);

        System.out.println("-------------------------------------");

        double seriesStart  =  1.0;    
        double numberRows = 20.0;  

        System.out.println("\ni         m(i)     ");
        System.out.println("-------------------");
        
        for (double i = seriesStart; i <= numberRows; i++) {
            System.out.printf("%-10.0f", i);
            System.out.printf("%7.4f\n", seriesSum(i));
        }
        
        int au = 1;

        int bu = 2;

        int cu = 3; 

        boolean r = cu % bu > bu / au || bu / bu != bu % cu && cu % bu <= bu /au;
    
        System.out.println(r);
    }

    public static double seriesSum (double n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += i / (i + 1);
        }
        return sum;
    }

    static double sumRain(double[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }


    static double averageRain(double[] array){
        double average = 0;
        average = sumRain(array)/array.length;
        return average;
    }
}