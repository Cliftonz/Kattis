import java.util.*;
public class beehives1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){

            //input
            ArrayList<point> hives = new ArrayList<>();
            double fightDistance = input.nextDouble() ;
            int numHives = input.nextInt();

            //if the end delimiter is reached then break out of the loop
            if(fightDistance == 0 && numHives == 0){
                break;
            }

            //put every point into an arraylist
            for(int i=0;i<numHives; i++){
                point temp = new point();
                temp.x = input.nextDouble();
                temp.y = input.nextDouble();
                temp.sour = false;
                hives.add(temp);
            }//for

            //process
            for(int i=0; i<hives.size(); i++){
                for(int k = 0; k<hives.size(); k++){
                    //Dont compare the point to itself
                    if(!(k == i)){
                        double distance = Math.sqrt(
                            Math.pow((hives.get(k).x - hives.get(i).x), 2) + 
                            Math.pow((hives.get(k).y - hives.get(i).y), 2));
                        if(distance <= fightDistance ){
                            hives.get(i).sour = true;
                            hives.get(k).sour = true;
                        }//if
                    }//if
                }//for k
            }//for i
            
            //output
            int sour = 0;
            int sweet =0;
            for(int i =0; i<hives.size(); i++){
                if(hives.get(i).sour == true){
                    sour++;
                }else{
                    sweet++;
                }
            }
            System.out.println(sour + " sour, "+sweet+" sweet");
        }//while
        input.close();
    }//main
}//class

class point{
    double x;
    double y;
    boolean sour;
}
