
package polimorfismo1;

/**
 *
 * @author jessica
 */
public abstract class Animal {
    //Atributos da classe animal
    protected float peso;
    protected int idade;
    protected int membros;
    
    //Métodos da classe animal
    // Como essa classe é abstrata, nenhum método será implementado 
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    //getters e setters
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
}
