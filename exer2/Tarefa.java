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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tarefa {
    public static void main(String[] args) {
        lerInformacoesAnimais("animais.txt");
    }
    
    public static void lerInformacoesAnimais(String arquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                String tipo = partes[0];
                String nome = partes[1];
                int idade = Integer.parseInt(partes[2]);
                boolean temDono = Boolean.parseBoolean(partes[3]);
                String raca = partes[4];
                boolean voa = Boolean.parseBoolean(partes[5]);
                String corPenas = partes[6];
                int numeroPatas = Integer.parseInt(partes[7]);
                String corPelo = partes[8];
                String profissao = partes[9];
                
                if (tipo.equals("Cachorro")) {
                    Cachorro cachorro = new Cachorro(nome, idade, numeroPatas, corPelo, raca, temDono);
                    System.out.println("Informações do Cachorro:");
                    System.out.println(cachorro.toString());
                    System.out.println("-------------------------");
                } else if (tipo.equals("Homem")) {
                    Homem homem = new Homem(nome, idade, numeroPatas, corPelo, profissao);
                    System.out.println("Informações do Homem:");
                    System.out.println(homem.toString());
                    System.out.println("-------------------------");
                } else if (tipo.equals("Beija-flor")) {
                    BeijaFlor beijaFlor = new BeijaFlor(nome, idade, voa, corPenas);
                    System.out.println("Informações do Beija-flor:");
                    System.out.println(beijaFlor.toString());
                    System.out.println("-------------------------");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}