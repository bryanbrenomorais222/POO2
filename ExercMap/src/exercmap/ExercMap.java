        
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
        /*
        Scanner leitor = new Scanner(System.in);
        HashMap<Integer, String> pessoas = new HashMap<Integer, String>();
        int numero;

        for(int i = 0; i < 2; i++){
            System.out.println("Digite o número da pessoa: ");
            numero = leitor.nextInt();
            System.out.println("Digite o nome da pessoa: ");
            String nome = leitor.next();  // Alteração neste ponto   
            pessoas.put(numero, nome);
        }

        System.out.println("Digite o número da pessoa que você deseja buscar: ");
        numero = leitor.nextInt();

        System.out.println("O nome da pessoa " + numero + " é " + pessoas.get(numero));
         */
        
        Map<String, String>map = new HashMap<>();
        
        map.put("Maria", "(49)3244-0181");
        map.put("Bryan", "(49)98916-0751");
        
        System.out.println("---------  Lista de Contatos --------------\n"+ map);
        
        System.out.println("\n------------Contato Específico--------------------");

        System.out.println("Número: " + map.get("Bryan"));
       
      
        
    }
    
    
    
}
