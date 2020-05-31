
package imdaulae3;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class VerificaNumeros {

    /**
     * @param args the command line arguments
     * Crie um programa para receber dois números e verificar se eles são iguais ou se um é maior que o outro.
     * Imprima uma mensagem indicando se os números são iguais ou, no caso deles serem diferentes, 
     * imprima o maior valor digitado.
     */
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner leitor  = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        num1 = leitor.nextInt();
        System.out.println("Informe outro numero: ");
        num2 = leitor.nextInt();
        System.out.println("Os numero digitados foram: "+num1+ " e "+num2);
        
        if(num1 > num2) {
            System.out.println("Numero 1 é maior que numero 2");
        }else if(num1 == num2){
            System.out.println("Os numeros digitados são iguais.");
        }else if(num2 > num1){
            System.out.println("Numero 2 é maior que numero 1");
        }
    }
    
}
