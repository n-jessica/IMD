
package imdaula12e1;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class Aluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("CADASTRO DE USUÁRIO");
        Pessoa aluno = criar();
        imprimir(aluno);
    }
    
    public static Pessoa criar() {
        Pessoa aluno = new Pessoa();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome:");
        aluno.nome = leitor.nextLine();
        System.out.println("Digite sua idade:");
        aluno.idade = leitor.nextInt();
        System.out.println("Digite o peso:");
        aluno.peso = leitor.nextFloat();
        System.out.println();
        return aluno;
    }
    
    public static void imprimir(Pessoa aluno) {
        System.out.println("--------------------------------");
        System.out.println("Dados do usuário "+aluno.nome);
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Nome:"+aluno.nome);
        System.out.println("Idade:"+aluno.idade);
        System.out.println("Peso:"+aluno.peso);
        
    }
    
}
