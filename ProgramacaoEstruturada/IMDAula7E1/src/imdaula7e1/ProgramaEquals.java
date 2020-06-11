package imdaula7e1;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class ProgramaEquals {

    /**
     * @param args the command line arguments
     *
     * Algorítmo tem por finalidade mostrar o uso da função EQUALS - usada na
     * comparação de variáveis do tipo String. O algorítmo compara dois nomes
     * informados pelo usuário.
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro nome:");
        String nome1 = leitor.next();
        System.out.println("Digite o segundo nome:");
        String nome2 = leitor.next();
        if (nome1.equals(nome2)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }
    }
}


