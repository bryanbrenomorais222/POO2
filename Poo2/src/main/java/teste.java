/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca("Mauro Paulo");
        Autor a1 = new Autor("Pondé");
        Capitulo chtr = new Capitulo(10);
        Livro book = new Livro("1284");
        
        book.setIsbn("3334");
        
        
        
        System.out.println("------------ Dados --------------------\n");
        System.out.println("Nome da Biblioteca: " +b.getNome());
        System.out.println("Número de Capítulos: " +chtr.getCap()+ "\nISBN: " +book.getIsbn());
        System.out.println("Autor: "+a1.getNomeAutor());
    }
    
}
