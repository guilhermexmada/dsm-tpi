/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto.teste;
import java.util.Scanner; //permite input de dados por parte do usuário

/**
 *
 * @author guilhermexmada
 */
public class ProjetoTeste {

    public static void main(String[] args) {
        
        //tipos de variáveis
        //boa prática de nomenclatura : camelCase (para variáveis ou funções, classes iniciam em maiúscula)
        int varInt;
        float varFloat; 
        double varDouble;

        //entrada de dados
        int num1, num2;
        //nova instância da classe Scanner
        //instâncias são acessos específicos de uma classe, requerendo classe nomeInst new classe();
        Scanner entrada = new Scanner(System.in);
        
        int resSoma, resSub, resMult;
        double resDiv;
        int n1 = 8;
        int n2 = 4;
        
        //operadores aritméticos
        /*
        SOMA -> +
        SUBTRAÇÃO -> -
        MULTIPLICAÇÃO -> *
        DIVISÃO -> /
        RESTO DE DIVISÃO -> %
        */
        resSoma = n1 + n2;
        resSub = n1 - n2;
        resMult = n1 * n2;
        resDiv = n1 / n2;
        
        //entrada, saída e concatenação
        System.out.println("Digite o numero 1: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o numero 2: ");
        num2 = entrada.nextInt();
        System.out.println("Resultado da soma e: " + resSoma);
        System.out.println("Resultado da subtracao e: " + resSub);
        System.out.println("Resultado da multiplicacao e: " + resMult);
        System.out.println("Resultado da divisao e: " + resDiv);
    }
}
