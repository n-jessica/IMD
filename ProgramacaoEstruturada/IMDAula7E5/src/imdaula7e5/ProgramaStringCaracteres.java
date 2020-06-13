package imdaula7e5;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class ProgramaStringCaracteres {

    /**
     * @param args the command line arguments
     * Algoritmo demonstra o uso da função toCharArray(). Essa função é aplicada a uma variável do tipo String, 
     * que no caso é nome1, e seu retorno é um array de caracteres com o tamanho exato do 
     * texto e que armazena exatamente os caracteres que formam o texto original.
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String nome1 = leitor.next();
        char[] caracteres = nome1.toCharArray();
        System.out.println("Inverso:");
        
        for (int i = caracteres.length - 1; i >= 0; i--) {
            System.out.print(caracteres[i]+" ");
            
        }
    }

}
