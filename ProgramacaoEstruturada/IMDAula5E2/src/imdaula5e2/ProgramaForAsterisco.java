
package imdaula5e2;

/**
 *
 * @author jessica
 */
public class ProgramaForAsterisco {

    /**
     * @param args the command line arguments
     * 
     * O algoritmo incrementa 10x o o texto, que no caso é o "*" (asterisco)
     */
    public static void main(String[] args) {
        String texto = "*";
		for (int i = 1; i <= 10; i++) {
			System.out.println(texto);
			texto = texto + "*";
		}
    }
    
}
