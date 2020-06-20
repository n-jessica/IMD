
package Automovel;

/**
 *
 * @author jessica
 */
public class Main {
    public static void main(String[] args) {
        Automovel automovel = new Automovel();
        
        
        //A Composição e o Método Construtor. 
        //Nesse caso, esta sendo usado o terceiro caso - chamadas fora da classe que é composta.
        Motor motor = new Motor();        
        automovel.setMotor(motor);
        
        System.out.println("Tipo: "+automovel.getMotor());
    }
}
