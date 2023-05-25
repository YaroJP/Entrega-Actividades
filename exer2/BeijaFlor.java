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
public class BeijaFlor {
    private String nome;
    private int idade;
    
    public BeijaFlor(String nome, int idade, boolean voa, String corPenas) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void voar() {
        System.out.println("O beija-flor está voando!");
    }
    
    public void emitirSom() {
        System.out.println("O beija-flor está emitindo um som!");
    }
}