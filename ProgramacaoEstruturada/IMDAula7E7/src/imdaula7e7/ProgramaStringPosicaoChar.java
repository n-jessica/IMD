package imdaula7e7;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class ProgramaStringPosicaoChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String nome1 = leitor.next();
        char ponto = '.';
        int inicio = 0;
        int posicao = nome1.indexOf(ponto);
        System.out.println("Existe ponto nas posições: ");
        while (inicio < nome1.length() && posicao != -1) {
            System.out.println(posicao);
            inicio = posicao + 1;
            posicao = nome1.indexOf(ponto, inicio);
        }
    }

}
