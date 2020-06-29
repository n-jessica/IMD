
package polimorfismo1;

/**
 *
 * @author jessica
 */
public class Mamifero extends Animal{
    //Atributo da classa mamifero
    private String corPelo;
    
    //Como a classe Animal é abstrata, os métodos locomover, alimentar e emitirSom
    //não pode ser implementado diretamente nela, contudo, a classe Mamífero herda 
    //os atributos e métodos da classe animal e assim, ela sobreescreve os métodos 
    //da classe animal, portanto, os métodos serão implementados 
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    
    //getters e setters

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
