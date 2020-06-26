
package heranca1;

/**
 *
 * @author jessica
 */
public class Heranca1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Criando os objetos
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("João");
        p4.setNome("Julia");
        
        p1.setIdade(26);
        p2.setIdade(16);
        p3.setIdade(55);
        p4.setIdade(33);
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
