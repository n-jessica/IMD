package imdaula6e3;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class Matriz {

    /**
     * @param args the command line arguments
     *
     * Faça um programa que leia uma matriz MxN, onde M e N são informados pelo
     * usuário.
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o numero de linha: ");
        int linha = leitor.nextInt();
        System.out.println("Informe o numero de coluna: ");
        int coluna = leitor.nextInt();
        int numeros[][] = new int[linha][coluna];

        int maior = 0;

        System.out.println("\n");
        System.out.println("Digite os numeros q vc quer inserir: ");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                numeros[i][j] = leitor.nextInt();

            }
        }
        
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                
                System.out.print(+numeros[i][j] + "  ");
            }
            System.out.print("\n");

        }

    }

}
