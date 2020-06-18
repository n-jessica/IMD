
package Fabrica;

/**
 *
 * @author jessica
 */
public class Teste {
    public static void main (String[] args) {
        
        //Criando objeto
        Carro meuCarro = new Carro();
        
        meuCarro.setTipo("Passeio");
        meuCarro.setCor("Preto");
        meuCarro.setPlaca("mxd - 5698");
        meuCarro.setNumPortas(4);
        
        System.out.println("Tipo: "+meuCarro.getTipo());
        System.out.println("Cor: "+meuCarro.getCor());
        System.out.println("Placa: "+meuCarro.getPlaca());
        System.out.println("Número de portas: "+meuCarro.getNumPortas());
    }
}
