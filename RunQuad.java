
package runquad;
import java.util.*;


public class RunQuad {
  

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        Square sq = new Square();
        
 
        
        while(true){
         System.out.println(" Press R for Recangle S for Square. ");
        String choice = scn.next();  
        
       if(choice.equalsIgnoreCase("S")) {
           System.out.println("A Squre");
           sq.showDescription();
       } else if(choice.equalsIgnoreCase("R")){
           System.out.println("A rectangle");
           rec.showDescription();
       }else{
               break;
       }
       
        }
        
        
    }
    
}
     