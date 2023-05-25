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
public class Ave extends Animal {
    private boolean voa;
    private String corPenas;
    
    public Ave(String nome, int idade, boolean voa, String corPenas) {
        super(nome, idade);
        this.voa = voa;
        this.corPenas = corPenas;
    }
    
    public boolean isVoa() {
        return voa;
    }
    
    public void setVoa(boolean voa) {
        this.voa = voa;
    }
    
    public String getCorPenas() {
        return corPenas;
    }
    
    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }
}

