
package imdaula4e4;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class Nota {

    /**
     * @param args the command line arguments
     * 
     * Crie um programa para receber uma nota e imprimir uma mensagem de acordo com a seguinte tabela:
     *  De 0 até 3 – Você precisa melhorar muito!
     *  Maior que 3 e menor que 7 – Você está quase conseguindo!
     *  Maior ou igual a 7 e menor que 9 – Você conseguiu!
     *  Maior ou igual a 9 – Você conseguiu com distinção!
     */
    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe uma nota: ");
        double nota = leitor.nextDouble();
        
        if(nota>=0 && nota<=2.9){
            System.out.println("Você precisa melhorar muito!");
        }else if(nota>=3 && nota<=6.9){
            System.out.println("Você está quase conseguindo!");
        }else if(nota>=7 && nota<=8.9){
            System.out.println("Você conseguiu!");
        }else if(nota >=9 && nota<=10){
            System.out.println("Você conseguiu com distinção!");
        }
    }
    
}
