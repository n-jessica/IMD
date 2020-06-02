package imdaula5e6;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class ProgramaDoWhileSorteio {

    /**
     * @param args the command line arguments
     *
     * Algoritmo sorteia numero com DO WHILE
     */
    public static void main(String[] args) {
        long numero = Math.round(Math.random() * 10);
        long chute;
        Scanner leitor = new Scanner(System.in);
        do {
            System.out.println("Digite um número entre 1 e 10");
            chute = leitor.nextLong();
        } while (numero != chute);
        System.out.println("Você acertou!");
    }
}


