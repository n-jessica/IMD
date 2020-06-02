package imdaula6e1;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class ProgramaNotasArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas a serem lidas");
        int quantidade = leitor.nextInt();
        double notas[] = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a nota de número " + i);
            notas[i] = leitor.nextDouble();
        }
        // ... aqui, faz o processamento das notas
    }
}


