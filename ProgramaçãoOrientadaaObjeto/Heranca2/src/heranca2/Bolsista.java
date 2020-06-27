
package heranca2;

/**
 *
 * @author jessica
 * 
 * A classe Bolsista recebe herança da classe aluno, portanto, além dela ter seus próprios 
 * atributos e métodos, ela herda os atributos e métodos da classe aluno
 */
public class Bolsista extends Aluno{
    //Atributo
    private float bolsa;
    
    //Métodos
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de "+this.getNome());
    }
    @Override //Sobrepõe o método
    public void pagarMensalidade() {
        System.out.println(this.getNome()+" é bolsista!! Pagamento facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
