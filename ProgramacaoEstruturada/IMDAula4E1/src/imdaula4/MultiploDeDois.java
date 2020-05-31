
package imdaula4;

/**
 *
 * @author jessica
 */

import java.util.Scanner;


public class MultiploDeDois {

    /**
     * Crie um programa em Java que receba 5 números e imprima a mensagem “Múltiplo de 2” 
     * caso a soma dos números digitados seja múltiplo de 2. Dica: para saber se um número é multiplo de 2,
     * basta verificar se o resto da divisão (operador %) do número por 2 é igual a zero
     */
    public static void main(String[] args) {
        
        int n1, n2, n3, n4, n5, soma;

        Scanner leitor = new Scanner(System.in).reset();
        System.out.println("Digite cinco números: ");
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        n3 = leitor.nextInt();
        n4 = leitor.nextInt();
        n5 = leitor.nextInt();
        
        soma= n1+n2+n3+n4+n5;
        if(soma%2==0){
            System.out.println("Esse número " +soma+ " é multiplo de dois");
        }
         
        
    }
    
}
