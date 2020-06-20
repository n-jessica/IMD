
package Agenda;

/**
 *
 * @author jessica
 */
public class Principal {
    
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();
        
        agenda1.anote(12, 10, "Dia das crianças");
        agenda2.anote(7, 15, "Independência do Brasil");
        
        agenda1.mostraAnotacao();
        agenda2.mostraAnotacao();
        
        
        //Se tirar as linhas de código abaixo do comentário, o código irá apresentar erro
        //pq os atributos e métodos estão privados na classe agenda.
        
        //agenda2.dia = 7;
        //agenda2.mes = 15;
        //agenda2.anotacao = "Independência do Brasil";
        
        //agenda2.mostraAnotacao();
    }
    
}
