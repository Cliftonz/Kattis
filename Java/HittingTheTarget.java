import java.util.*;

import javax.xml.ws.Holder;
public class HittingTheTarget{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int NumTargets = input.nextInt();
        ArrayList<rec> arrR = new ArrayList<rec>();
        ArrayList<cir> arrC = new ArrayList<cir>();       
        for(int i =0; i < NumTargets; i++){
            String type = input.next();
            if(type.charAt(0)=='r'){
                int x1 = input.nextInt();
                int y1 = input.nextInt();
                int x2 = input.nextInt();
                int y2 = input.nextInt();
                
                rec temp = new rec(x1,y1,x2,y2);
                arrR.add(arrR.size(), temp);
            }
            else{
                int x = input.nextInt();
                int y = input.nextInt();
                int r = input.nextInt();
                cir temp = new cir(x,y,r);
                arrC.add(arrC.size(), temp);
            }
        }
        int NumOfShots = input.nextInt();
         
        for(int i =0;i < NumOfShots ; i++){
            int x = input.nextInt();
            int y = input.nextInt();
            int NumOfHits=0;// number of times that a point is in the shape

            // process rectangles
            for(int j = 0; j< arrR.size(); j++){
                rec temp = arrR.get(j);
                if(y >= temp.y1 && y <= temp.y2 && x >= temp.x1 && x<= temp.x2 ){
                    NumOfHits++;
                   // System.out.print("in rec"); echo
                }
            }
            //process circles
            for(int k = 0 ; k < arrC.size();k++){
                cir temp = arrC.get(k);
                // if x^2 + y^2 = r^2
                if((( x - temp.x)*(x-temp.x) ) + ((y - temp.y) *(y -temp.y)) <= (temp.r *temp.r)) {
                    NumOfHits++;
                    //System.out.print("in cir"); echo
                }
            }
            System.out.println(NumOfHits);
        }
        
    }
    
    public static class rec{
        public int x1,y1,x2,y2;
        rec(int x1, int y1, int x2, int y2){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }
    public static class cir{
        int x,y,r;
        cir(int x,int y, int r){
            this.x = x;
            this.y = y;
            this.r = r;
        }
    }
    
}
