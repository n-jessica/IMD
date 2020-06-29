
package polimorfismo2;

/**
 *
 * @author jessica
 */
public class Polimorfismo2 {

    /**
     * @param args the command line arguments
     * 
     * Programa exemplifica o polimorfismo de sobrecarga - assinatura diferente e mesma classe
     */
    public static void main(String[] args) {
        // Testando
        Mamifero m = new Mamifero();
        Cachorro c = new Cachorro();
        Lobo l = new Lobo();
        
        //c.reagir("Ola");
        c.reagir(11, 45);
        c.reagir(19, 00);
        c.reagir(true);
        c.reagir(false);
        
        
    }
    
}
