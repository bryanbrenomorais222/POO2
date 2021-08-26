/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan
 */
public class Livro {
    private String isbn;
    private Capitulo c;
    private Autor aut;

    
    public Livro(String isbn) {
        this.isbn = isbn;
    }
    
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Capitulo getC() {
        return c;
    }

    public void setC(Capitulo c) {
        this.c = c;
    }

    public Autor getAut() {
        return aut;
    }

    public void setAut(Autor aut) {
        this.aut = aut;
    }
    
    
}
