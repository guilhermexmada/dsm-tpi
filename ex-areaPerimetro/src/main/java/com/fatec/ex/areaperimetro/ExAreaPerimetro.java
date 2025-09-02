/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex.areaperimetro;
import java.util.Scanner;
/**
 *
 * @author guilherme shimada pereira
 * A partir das medidas dos lados de um retângulo, calcule sua área e perímetro.
 * Tudo em centímetros.
 */
public class ExAreaPerimetro {

    public static void main(String[] args) {
        //variáveis
        Scanner input = new Scanner(System.in);
        double lado1, lado2, area, perimetro;
        //entradas
        System.out.println("Digite o comprimento do retangulo em cm: ");
        lado1 = Double.parseDouble(input.nextLine());
        System.out.println("Digite a altura do retangulo em cm: ");
        lado2 = Double.parseDouble(input.nextLine());
        //processamento
        area = lado1 * lado2;
        perimetro = 2*lado1 + 2*lado2;
        //saídas
        System.out.println("Area: " + area + " cm \n" + "Perimetro: " + perimetro + " cm");
    }
}
