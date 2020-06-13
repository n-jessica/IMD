package imdaula7e6;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class ProgramaString {

    /**
     * @param args the command line arguments
     * Algorítmo para demonstrar o uso das funções length() e charAt().
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String nome1 = leitor.next();
        System.out.println("Inverso:");
        for (int i = nome1.length() - 1; i >= 0; i--) {
            System.out.print(nome1.charAt(i));
        }
    }

}
