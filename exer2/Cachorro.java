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
public class Cachorro extends Mamifero {
    private String raca;
    private boolean temDono;
    
    public Cachorro(String nome, int idade, int numeroPatas, String corPelo, String raca, boolean temDono) {
        super(nome, idade, numeroPatas, corPelo);
        this.raca = raca;
        this.temDono = temDono;
    }
    
    public String getRaca() {
        return raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public boolean isTemDono() {
        return temDono;
    }
    
    public void setTemDono(boolean temDono) {
        this.temDono = temDono;
    }
}