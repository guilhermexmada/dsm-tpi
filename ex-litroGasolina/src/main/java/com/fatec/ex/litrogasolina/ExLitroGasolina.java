/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex.litrogasolina;
import java.util.Scanner;
/**
 *
 * @author guilherme shimada pereira
 * Faça um algoritmo que leia os litros de gasolina em um veículo e calcule o 
 * valor a ser pago, sabendo que o preço do litro é 5,39.
 */
public class ExLitroGasolina {

    public static void main(String[] args) {
        //variáveis
        Scanner input = new Scanner(System.in);
        double litros, preco;
        //entradas
        System.out.println("Quantos litros de gasolina ha no seu veiculo?");
        litros = Double.parseDouble(input.nextLine());
        preco = litros * 5.39;
        System.out.println("Total a pagar: R$ " + preco);
    }
}
