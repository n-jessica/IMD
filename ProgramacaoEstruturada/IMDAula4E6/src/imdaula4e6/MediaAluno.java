
package imdaula4e6;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class MediaAluno {

    /**
     * @param args the command line arguments
     * 
     * Numa faculdade, os alunos com média maior ou igual a 7,0 são aprovados, 
     * aqueles com média inferior a 3,0 são reprovados e os demais ficam de recuperação. 
     * Implemente um programa que dada a média do aluno indique a sua situação: 
     * 'Aprovado', 'Reprovado' ou 'Recuperação'
     */
    public static void main(String[] args) {
        
        float nota;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a nota do aluno: ");
        nota = leitor.nextFloat();
        
        if(nota>=7.0) {
            System.out.println("Alunos aprovado!");
        }else if(nota<=3.0) {
            System.out.println("Aluno reprovado!");
        }else{
            System.out.println("Aluno em recuperação!");
        }
    }
    
}
