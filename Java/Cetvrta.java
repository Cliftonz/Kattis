import java.util.*;

public class Cetvrta{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /* 
        boolean[] corners =new boolean[4];// coresponds to BL, BR, TR, TL

        point[] points = new point[3]; 
        points[0] = new point();
        points[0].x = input.nextInt();
        points[0].y = input.nextInt();

        points[1] = new point();
        points[1].x = input.nextInt();
        points[1].y = input.nextInt();

        points[2] = new point(); 
        points[2].x = input.nextInt();
        points[2].y = input.nextInt();

        //sort(points, corners); // coresponds to BL, BR, TR, TL

        int min;
        int max;
        int temp = -9999;
        for(int i = 0; i < 2; i++){

            if(points[i].x == points[i].y){
               
                if(temp > 0){

                    if(temp > points[i].x){
                        max = temp;
                        min = points[i].x;
                        corners[0] = true;
                        corners[2] = true;
                    }else{
                        min = temp;
                        max = points[i].x;
                        corners[0] = true;
                        corners[2] = true;
                    }// TR/BL
                }else{
                    temp = points.x;
                }// 
            }else{
                if(points[i].x >= points[i].y)  {
                    max = points.x;
                }else{
                    min = points.y;
                }//else
            }//else
        }//for

        if(corners[0] == false){
            System.out.print(points[3].x+" "+ points[1].y);
        } else if(corners[1] == false){
            System.out.print(points[0].x+" "+ points[2].y);
        } else if(corners[2] == false){
            System.out.print(points[2].x+" "+ points[0].y);
        }else{
            System.out.print(points[3].x+
            " "+ points[1].y);
        }
    }

    public static void sort(point[] box, boolean[] corners){

        point[] temp = new point[4];

        for(int i=0; i < 4; i ++){
            temp[i] = new point();
        }

        // find bottom left
        for(int i = 0; i<3; i++){
            //System.out.println(i);
        if(box[wrap(i)].x <= box[wrap(i+1)].x && 
            box[wrap(i)].x <= box[wrap(i+2)].x &&
            box[wrap(i)].y <= box[wrap(i+1)].y && 
            box[wrap(i)].y <= box[wrap(i+2)].y){
                //System.out.println(box[i].x +" "+ box[i].y);
                temp[0].equals(box[i]);
                corners[0] = true;
            }
        }
        // find bottom right
        for(int i = 0; i<3; i++){
            if(box[wrap(i)].x >= box[wrap(i+1)].x && 
                box[wrap(i)].x >= box[wrap(i+2)].x &&
                box[wrap(i)].y <= box[wrap(i+1)].y && 
                box[wrap(i)].y <= box[wrap(i+2)].y){
                    temp[1].equals(box[i]);
                    corners[1] = true;
                }
        }
        // find top right
        for(int i = 0; i<3; i++){
            if(box[wrap(i)].x >= box[wrap(i+1)].x && 
                box[wrap(i)].x >= box[wrap(i+2)].x &&
                box[wrap(i)].y >= box[wrap(i+1)].y && 
                box[wrap(i)].y >= box[wrap(i+2)].y){
                    temp[2].equals(box[i]);
                    corners[2] = true;
                }
        }
        // find top left
        for(int i = 0; i<3 ; i++){
            if(box[wrap(i)].x <= box[wrap(i+1)].x && 
                box[wrap(i)].x <= box[wrap(i+2)].x &&
                box[wrap(i)].y >= box[wrap(i+1)].y && 
                box[wrap(i)].y >= box[wrap(i+2)].y){
                    temp[3].equals(box[i]);
                    corners[3] = true;
                }
        }
        for(int i = 0; i<3; i++){
            box[i].equals(temp[i]);
        }
    }

    public static int wrap(int i){
        int temp = 0;
        if(i >= 3){
            temp = i - 3;
        }
        return temp;
    } 
}

class point{

    int x;
    int y;

    point(){
        x = 0;
        y = 0;
    }

    public void equals(point o){
        this.x = o.x;
        this.y = o.y;
    }
*/}
}