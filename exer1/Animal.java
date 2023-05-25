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
public class Animal {
    private String nome;
    private int patas;
    String ambiente;
    private String cor;
    
    public Animal(String nome, int patas, String cor, String ambiente) {
        this.nome = nome;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome +
               "\nPatas: " + patas +
               "\nCor: " + cor +
               "\nAmbiente: " + ambiente;
    }
}