
package yaro.exer1;

/**
 *
 * @author YARO JP
 */

import yaro.exer1.Mamifero;
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
                int patas = Integer.parseInt(partes[2]);
                String cor = partes[3];
                String ambiente = partes[4];
                String caract = partes[5];
                
                if (tipo.equals("Mamifero")) {
                    Mamifero mamifero = new Mamifero(nome, patas, cor, ambiente);
                    System.out.println("Informações do Mamífero:");
                    System.out.println(mamifero.toString());
                    System.out.println("-------------------------");
                } else if (tipo.equals("Peixe")) {
                    Peixe peixe = new Peixe(nome, caract);
                    System.out.println("Informações do Peixe:");
                    System.out.println(peixe.toString());
                    System.out.println("-------------------------");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
