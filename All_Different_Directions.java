

import java.util.Scanner;
import java.lang.Math;

public class All_Different_Directions{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //This varibal hold the amount of iteratations that the testcase would go through
        int NPeople;

        ArrayList<cord> avergePoints = new ArrayList<>();

        do
        {
            NPeople = input.nextInt();

            for(int i = 0; i < NPeople; i++){
                String line = input.nextLine();
                
                String[] lineSubstring = line.split(" ");
                double x = Double.parseDouble(lineSubstring[0]);

                double y = Double.parseDouble(lineSubstring[1]);

                double currentAngle = Double.parseDouble(lineSubstring[3]);

                for(int k = 4 ; k < lineSubstring.length; k+=2){
                    switch(lineSubstring[k]){
                        case"walk":
                            y += Math.sin(Math.toRadians(curentAngle)) * Double.parseDouble( lineSubstring[k+1]) ;
                            x += Math.acos(Math.toRadians(currentAngle)) * Double.parseDouble( lineSubstring[k+1]);
                            break;
                        case"turn":
                            curentAngle += lineSubstring[k+1];
                            break;
                    }
                }//for k
                averagePoints
            //System.out.print();
            }//for i
        }while(NPeople != 0);
    }//main
}//alldifferentDirrections

class cord{

    double x;
    double y;

    cord(){
        x =0;
        y=0;
    }//constructor

    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }//set
}//cord