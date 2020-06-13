/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imdaula9e;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class ProgramaFatorialRecursivo {

    /**
     * @param args the command line arguments
     * 
     * Com um algoritmo q calcula o fatorial de um número, o objetivo desse programa é mostrar o uso da recursão no desen-
     * volvimento de um programa.
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = leitor.nextInt();
        int fat = fatorial(numero);
        if (fat > 0) {
            System.out.println("O fatorial desse número é " + fat);
        } else {
            System.out.println("Não existe fatorial para números negativos!");
        }
    }

    public static int fatorial(int numero) {
        int fat;
        if (numero < 0) {
            fat = -1;
        } else if (numero == 0) {
            fat = 1;
        } else {
            fat = fatorial(numero - 1) * numero;
        }
        return fat;
    }
}
