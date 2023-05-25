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
public class Peixe {
    private String nome;
    private String caract;
    
    public Peixe(String nome, String caract) {
        this.nome = nome;
        this.caract = caract;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome +
               "\nCaracterísticas: " + caract;
    }
}
