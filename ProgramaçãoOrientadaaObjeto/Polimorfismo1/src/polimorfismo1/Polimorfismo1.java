
package polimorfismo1;

/**
 *
 * @author jessica
 */
public class Polimorfismo1 {

    /**
     * @param args the command line arguments
     * 
     * Esse programa apresenta o conceito de POLIMORFISMO. Aborda o conceito de Polimorfismo de sobrecarga - mesma assinatura, mas em classes diferentes
     * Obs.: Com relação as carcteriticas dos animais - não entendo de biologia, o que interessa é a parte da programação kkkkkk...
     */
    public static void main(String[] args) {
        // Criando objetos
        // Animal n = new Animal(); --> Irá ocorrer um erro pois a classe animal é abstrata e por isso não pode ser instanciada
        // Testando os métodos 
            Mamifero m = new Mamifero();
           Reptil r = new Reptil();
           Peixe p = new Peixe();
           Ave a = new Ave();
           Canguru can = new Canguru();
           Cachorro cac = new Cachorro();
           
           
           //m.alimentar();
           can.locomover();
           cac.emitirSom();
    }
    
}
