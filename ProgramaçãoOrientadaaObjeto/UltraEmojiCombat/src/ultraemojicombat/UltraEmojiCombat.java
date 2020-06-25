
package ultraemojicombat;

/**
 *
 * @author jessica
 */
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     * Programa que demonstra uso de agregação em um código. 
     */
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("João", "EUA", 35, 1.65f, 80.6f, 12, 2, 1);
        l[3] = new Lutador("José", "Autrália", 25, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Mateus", "Mexico", 37, 1.81f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Chico", "Brasil", 32, 1.82f, 105.4f, 12, 2, 4);
        
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        
        l[0].status();
        l[1].status();
    }
    
}
