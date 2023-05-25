/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaro.exer2;

/**
 *
 * @author YARO JP
 */
public class Mamifero extends Animal {
    private int numeroPatas;
    private String corPelo;
    
    public Mamifero(String nome, int idade, int numeroPatas, String corPelo) {
        super(nome, idade);
        this.numeroPatas = numeroPatas;
        this.corPelo = corPelo;
    }
    
    public int getNumeroPatas() {
        return numeroPatas;
    }
    
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
    public String getCorPelo() {
        return corPelo;
    }
    
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
