
package heranca2;

/**
 *
 * @author jessica
 */
public class Heranca2 {

    /**
     * @param args the command line arguments
     * 
     * Esse algorítmo trabalha com a continuação de Herança.
     * Nele é abordado tópicos como: Super classe, sub-classe, ancestral, descendentes,
     * classe raiz, classe folha, generalização, especialização,
     * tipos de herança, classe abstrata, métodos abstratos, classe final, método final.
     */
    public static void main(String[] args) {
        // Criando e instanciando Objetos
        // Abaixo exemplo do uso dos atributos, métodos e tudo que foi aplicado nesse programa.
               
        System.out.println("###### INFORMAÇÕES ######");
        System.out.println("\n");
        
        Aluno a1 = new Aluno();
        a1.setMatricula(2020);
        a1.setCurso("Informatica");
        a1.setNome("Maria");
        a1.setIdade(16);
        a1.setSexo("F");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
       
        System.out.println("--------------------------------------------");
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(2021);
        b1.setCurso("Informatica");
        b1.setNome("João");
        b1.setIdade(17);
        b1.setSexo("M");
        System.out.println(b1.toString());
        b1.pagarMensalidade();
    }
    
}
