
package imdaula4e5;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class Letra {

    /**
     * @param args the command line arguments
     * 
     * Crie um programa para receber uma letra do usuário e imprimir o nome de um país
     * que se inicie com essa letra. Caso não exista um país com nome iniciado pela letra
     * digitada, informar isso ao usuário.
     */
    public static void main(String[] args) {
        String letra;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        letra = leitor.nextLine();
        switch (letra) {
            case "a":
                System.out.println("Você digitou a letra "+letra+" ,portanto, o país é: Argentina");
                break;
            case "b":
                System.out.println("Você digitou a letra "+letra+" ,portanto, o país é: Brasil");
                break;
            case "c":
                System.out.println("Você digitou a letra "+letra+" ,portanto, o país é: Canadá");
                break;
            case "d":
                System.out.println("Você digitou a letra "+letra+" ,portanto, o país é: Dinamarca");
                break;
            case "e":
                System.out.println("Você digitou a letra "+letra+" ,portanto, o país é: Espanha");
                break;
            case "f":
                System.out.println("Você digitou a letra "+letra+" ,portanto, o país é: França");
                break;
            case "g":
                System.out.println("Você digitou a letra "+letra+" ,portanto, o país é: Grécia");
                break;
            case "h":
                System.out.println("Você digitou a letra "+letra+" ,portanto, o país é: Haiti");
                break;
            case "i":
                System.out.println("Você digitou a letra "+letra+" ,portanto, o país é: Itália");
                break;
            case "j":
                System.out.println("Você digitou a letra "+letra+" ,portanto, o país é: Japão");
                break;
            default:
                System.out.println("A letra informada não condiz com as seguintes letras: "
                        + "a, b ,c , d, e, f, g, h, i, j. \n Tente novamente.");
        }
    }
    
}
