
package heranca2;

/**
 *
 * @author jessica
 * 
 * A classe aluno recebe herança da classe Pessoa, portanto, além dela ter seus próprios 
 * atributos e métodos, ela herda os atributos e métodos da classe Pessoa.
 */
public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String curso;
    
    //Método
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade normal");
    }
    
    //Getters e setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
        System.out.println("Matrícula: "+this.getMatricula());
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
        System.out.println("Faz o curso de: "+this.getCurso());
    }
    
}
