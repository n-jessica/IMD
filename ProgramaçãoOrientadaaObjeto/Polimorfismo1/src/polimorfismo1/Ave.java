
package polimorfismo1;

/**
 *
 * @author jessica
 */
public class Ave extends Animal{
    //Atributo classe ave
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
    
    //getters e setters

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    
}
