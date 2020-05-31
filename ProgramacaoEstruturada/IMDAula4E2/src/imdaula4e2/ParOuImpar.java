
package imdaula4e2;

/**
 *
 * @author jessica
 */

import java.util.Scanner;

public class ParOuImpar {

    /**
     * Crie um programa para receber um número e indicar se ele é par ou ímpar.
     */
    public static void main(String[] args) {
        int numero;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        numero = leitor.nextInt();
        
        if (numero%2==0){
            System.out.println( +numero+" é par");
        }else{
            System.out.println( +numero+" é ímpar");
        }
    }
    
}
