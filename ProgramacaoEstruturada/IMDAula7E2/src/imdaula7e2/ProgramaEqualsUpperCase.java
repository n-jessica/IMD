/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imdaula7e2;

import java.util.Scanner;

/**
 *
 * @author jessica
 */
public class ProgramaEqualsUpperCase {

    /**
     * @param args the command line arguments toUpperCase - retorna o texto em
     * maiúsculo.
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro nome:");
        String nome1 = leitor.next();
        System.out.println("Digite o segundo nome:");
        String nome2 = leitor.next();
        nome1 = nome1.toUpperCase();
        nome2 = nome2.toUpperCase();
        if (nome1.equals(nome2)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
            
        }
        System.out.println("\n");
        System.out.println(nome1);
        System.out.println(nome2);
    }
}
