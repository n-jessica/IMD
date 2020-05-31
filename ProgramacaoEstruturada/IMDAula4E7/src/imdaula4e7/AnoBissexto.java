
package imdaula4e7;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class AnoBissexto {

    /**
     * @param args the command line arguments
     * Informado um ano pelo usuário, informe se ele é ou não bissexto.
     * Dica: um ano é bissexto se é divisível por 400 ou se é divisível por 4 mas não por 100.
     */
    public static void main(String[] args) {
        
        int ano;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um ano: ");
        ano = leitor.nextInt();
        
        if(ano%400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("Esse ano " +ano+ " é bissexto");
        }else{
            System.out.println("Esse ano " +ano+ " não é bissexto");
        }
    }
    
}
