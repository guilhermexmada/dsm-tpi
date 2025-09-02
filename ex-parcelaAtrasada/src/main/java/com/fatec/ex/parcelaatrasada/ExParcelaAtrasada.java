/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex.parcelaatrasada;
import java.util.Scanner;
/**
 *
 * guilherme shimada pereira
 * Efetue o cálculo do valor de uma parcela em atraso lendo o valor da prestação
 * e a taxa de juros. Considere juros simples.
 */
public class ExParcelaAtrasada {
    
    public static void main(String[] args) {
        //instâncias
        Scanner input = new Scanner(System.in);
        //variáveis
        double valParcela, taxaJuros, valTotal;
        int meses;
        //entradas
        System.out.println("Digite o valor da parcela: ");
        valParcela = Double.parseDouble(input.nextLine());
        System.out.println("Digite a taxa de juros: ");
        taxaJuros = Double.parseDouble(input.nextLine());
        System.out.println("Digite os meses em atraso: ");
        meses = Integer.parseInt(input.nextLine());
        valTotal = valParcela + (valParcela * (taxaJuros/100) * meses);
        System.out.println("Valor total de atraso: R$ " + valTotal + ",00");
    }
}
