package imdaula5e3;

/**
 *
 * @author jessica
 */
public class ProgramaForInfinito {

    /**
     * @param args the command line arguments
     *
     * O laço mostrado irá imprimir a mensagem “Olá” sem parar, pois há um erro
     * na condição de incremento, que está i = i, ao invés de i = i + 1.
     */
    public static void main(String[] args) {
        for (int i = 1; i < 10; i = i) {
            System.out.println("Olá");
        }
    }

}
