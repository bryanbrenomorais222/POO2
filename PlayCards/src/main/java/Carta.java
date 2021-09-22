/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan
 */
public class Carta {
    private int m_value;
   private String m_suit;

    public int getM_value() {
        return m_value;
    }

    public String getM_suit() {
        return m_suit;
    }

    public void setM_value(int m_value) {
        this.m_value = m_value;
    }

    public void setM_suit(String m_suit) {
        this.m_suit = m_suit;
    }

   public Carta(int value, String suit) throws Exception {
       if(value < 1){
           
           throw new Exception("Número menor que 1 não existe");
       }if(value > 13){
           throw new Exception("Não existe número maior que 13 no baralho");
       }else if(suit == "copas" || suit == "paus" || suit == "espadas" || suit == "ouro"){
           setM_value(value);
           setM_suit(suit);
       }
   }

   public int value(){
       return m_value;
   }
   
   public String suit(){
       return m_suit;
   }
   
   @Override
   public String toString(){
       String[] name = { "Zero","As", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Rei", "Dama"};
       return name[m_value] + " de " + m_suit;
   }
}
