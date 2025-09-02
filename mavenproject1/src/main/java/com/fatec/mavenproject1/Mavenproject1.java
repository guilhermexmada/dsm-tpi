/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author guilherme shimada pereira
 * aula 02: operações aritméticas
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        int i;
        int n1 = 1;
        int n2 = 5;
        int n3 = 10;
        int n4 = 8;
        int n5 = 7;
        int n6 = 8;
        float media1, media2, somaMedias, teste;
        
        media1 = (n1 + n2 + n3)/3;
        media2 = (n4 + n5 + n6)/3;
        somaMedias = media1 + media2;
        
        teste = ((1+5+10)/3 +(8+7+8)/3);
                 
        System.out.println("A soma das médias é : " + somaMedias + " | " + teste);
        
    }
}
