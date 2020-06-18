
package Fabrica;

/**
 *
 * @author jessica
 * 
 * Iniciando estudos de Programação Orientada a Objetos
 */
public class Carro {
    //Atributos
    String tipo;
    String cor;
    String placa;
    int numPortas;
    
    //Declarando um construtor
    public Carro(){
        
    }
    
    //Métodos Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    
}
