
package polimorfismo2;

/**
 *
 * @author jessica
 */
public class Mamifero extends Animal{
    //Atributo Mamifero
    protected String corPelo;
    
    //Método
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    
    //Getters e setters

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
