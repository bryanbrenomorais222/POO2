



public class Baralho {
      private final Carta[] cartas;
    private final  int top;
    
    public Baralho() throws Exception{
        cartas = new Carta[52];
        top = 51;
        
        String[] s = {"copas", "paus", "ouro", "espadas"};
        
        int j = 1;
        int y = 0;
        for(int i = 0; i < 52; i++){
            if (j == 14) { 
                j = 1;
            }
            if (y == 4) {
                y = 0;
            }
            cartas[i] = new Carta(j, s[y]);         
            System.out.println(cartas[i].getM_value() + " de " + cartas[i].getM_suit()+ "\n") ;
            j++;
            y++;
        }
     
    }
   
  
}
