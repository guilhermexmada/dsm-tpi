/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex.salariomensal;
import java.util.Scanner;

/**
 *
 * @author guilherme shimada pereira
 * Escreva um algoritmo para ler o salário mensal atual de um funcionário e 
    o percentual de reajuste. Calcule e escreva o valor do novo salário.
 */
public class ExSalarioMensal {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float salario;
        float percReajuste;
        float novoSalario;
        System.out.println("Digite seu salario atual: ");
        salario = Float.parseFloat(input.nextLine());
        System.out.println("Digite o percentual de reajuste: ");
        percReajuste = Float.parseFloat(input.nextLine());
        novoSalario = salario + ((salario/100)*percReajuste);
        System.out.println("Seu novo salario e: " + novoSalario);
    }
}
