package imdaula6e2;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class ProgramaNotasArray1 {

    /**
     * @param args the command line arguments
     *
     * Altere o ProgramaNotasArray para que imprima as notas na tela, depois de
     * lidas, mostrando sua localização no array em termos de índice (de zero à
     * quantidade - 1) e de ordem (de um a quantidade).
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas a serem lidas");
        int quantidade = leitor.nextInt();
        double notas[] = new double[quantidade];
        
        
    
        for ( int i = 0; i < quantidade; i++) {
            System.out.println("Digite a nota de número " + (i+1));
            notas[i] = leitor.nextDouble();
        }
        for(int i=0; i<=quantidade-1;i++){
            System.out.println("");
            System.out.println("-----------------------------------");
            System.out.println("Nota: " + notas[i]+ " - Índice: "+i);
        }
       
        
        
        
      
        // ... aqui, faz o processamento das notas
    }
}


