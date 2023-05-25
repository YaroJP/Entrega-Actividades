/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaro.exer1;

/**
 *
 * @author YARO JP
 */
public class Mamifero extends Tarefa {
    private String nome;
    private int patas;
    private String cor;
    
    public Mamifero(String nome, int patas, String cor, String ambiente) {
        //super(ambiente);
        this.nome = nome;
        this.patas = patas;
        this.cor = cor;
    }
    
    // Getters e Setters
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getPatas() {
        return patas;
    }
    
    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome +
               "\nPatas: " + patas +
               "\nCor: " + cor +
               "\n" + super.toString();
    }
}

