import java.util.*;
public class Babelfish{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<dictionary> arr = new ArrayList<dictionary>(); 
        while(input.hasNext()){
            String line = input.nextLine();
            if(line.trim().equals("")){
                break;
            }
            else
            {
                dictionary temp = new dictionary();
                //System.out.println(line);
                String[] dicW = new String[2];
                dicW = line.split(" ");
                
                temp.english = dicW[0];
                //System.out.println(temp.english);
                temp.foreign = dicW[1];
                //System.out.println(temp.foreign);
                arr.add(temp);  
            }
        }
        while(input.hasNext())
        {
            boolean isThere = false;
            String wordToSearch = input.next();
            dictionary temp = new dictionary();
            for(int i =0; i<arr.size(); i++)
            {
                temp = arr.get(i);
                if(temp.foreign.equals( wordToSearch))
                {
                    System.out.println(temp.english);
                    isThere = true;
                    break;
                }
                else
                {
                    isThere = false;
                }
            }
            if(isThere == false)
            {
            System.out.println("eh");
            }
        }
    }
}

class dictionary{
    String english;
    String foreign;
    dictionary(){
        String english= "";
        String foreign = "";
    }
}