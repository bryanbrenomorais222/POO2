        
package exercmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * 
 */
public class ExercMap {

    public static void main(String[] args) {
        
       
        
        Map<String, String>map = new HashMap<>();
        
        map.put("Maria", "(49)3244-0181");
        map.put("Bryan", "(49)98916-0751");
        
        System.out.println("---------  Lista de Contatos --------------\n"+ map);
        
        System.out.println("\n------------Contato Específico--------------------");

        System.out.println("Número: " + map.get("Bryan"));
       
      
        
    }
    
    
    
}
