/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex.lojamoveis;
import java.util.Scanner;

/**
 *
 * guilherme shimada pereira
 * Uma loja de móveis paga a seu vendedor um fixo de R$1000,00 mensais e um
 * bônus de R$50,00 por móvel vendido. Leia a quantidade de móveis vendidos por
 * um vendedor e calcule o salário total do funcionário. Mostre a quantidade 
 * vendida e o salário total.
 */
public class ExLojaMoveis {

    public static void main(String[] args) {
        //instâncias
        Scanner input = new Scanner(System.in);
        //variáveis
        int quant;
        double salTotal;
        //entradas
        System.out.println("Digite a quantidade de móveis vendidos nesse mês: ");
        quant = Integer.parseInt(input.nextLine());
        //processamento
        salTotal = 1000 + (quant * 50);
        //saídas
        System.out.println("Seu salário mensal é de R$ " + salTotal + ",00 com " + quant + " móveis vendidos." );
    }
}
