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
public class Homem extends Mamifero {
    private String nome;
    private int idade;
    private String profissao;
    
    public Homem(String nome, int idade, int numeroPatas, String corPelo, String profissao) {
        super(nome, idade, numeroPatas, corPelo);
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
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
}

