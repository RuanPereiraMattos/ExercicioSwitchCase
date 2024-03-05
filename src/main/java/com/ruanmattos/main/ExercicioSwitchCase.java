/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ruanmattos.main;

import java.util.Scanner;

/**
 *
 * @author Ruan Pereira Mattos
 */
public class ExercicioSwitchCase {

    /**
     *
     * 01. Escreva um programa que leia um número inteiro de 1 a 4 e imprima o nome de uma estação do ano correspondente usando switch case. Por exemplo, se o número for 1, imprima “Verão”.
     *
     * 02. Escreva um programa que leia um número inteiro de 1 a 12 e imprima o nome do mês correspondente usando switch case. Por exemplo, se o número for 1, imprima “Janeiro”.
     *
     * 03. Escreva um programa que leia uma letra maiúscula ou minúscula e imprima se ela é uma vogal ou uma consoante usando switch case. Por exemplo, se a letra for A ou a, imprima “Vogal”.
     *
     * 04. Escreva um programa que recebe um número inteiro entre 1 e 3. O programa deve usar uma estrutura `switch-case` para verificar o valor do número. Se o número for 1, o programa deve imprimir
     * 'Número é 1'. Se o número for 2, deve imprimir 'Número é 2'. Se o número for 3, deve imprimir 'Número é 3' e, em seguida, usar uma estrutura `if-else` para verificar se o número é maior que 2.
     * Se for maior, deve imprimir 'Número é maior que 2', caso contrário, deve imprimir 'Número não é maior que 2'. Se o número não for 1, 2 ou 3, o programa deve imprimir 'Número não é 1, 2 ou 3'.
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Bem vindo(a) ao exercício de estações do ano");
        System.out.println("Exercício 1: Estações do Ano");
        System.out.println("Exercício 2: Meses do Ano");
        System.out.println("Exercício 3: Vocal ou Consoante");
        System.out.println("Exercício 4: Número entre 1 e 3");
        System.out.print("Escolha uma opção: ");
        Scanner s = new Scanner(System.in);
        int opcao = s.nextInt();
        s.nextLine();
        switch (opcao) {
            case 1 -> {
                System.out.println("Bem vindo(a) ao programa estações do ano");
                System.out.println("Digite um número entre 1 e 4");
                System.out.print("Número: ");
                opcao = s.nextInt();
                s.nextLine();
                switch (opcao) {
                    case 1 ->
                        System.out.println("O número digitado corresponde à estação do ano: Verão");
                    case 2 ->
                        System.out.println("O número digitado corresponde à estação do ano: Outono");
                    case 3 ->
                        System.out.println("O número digitado corresponde à estação do ano: Inverno");
                    case 4 ->
                        System.out.println("O número digitado corresponde à estação do ano: Primavera");
                    default ->
                        System.out.println("O número digitado não corresponde a nenhuma estação do ano, tente novamente!");
                }
            }
            case 2 -> {
                System.out.println("Bem vindo(a) ao programa meses do ano");
                System.out.println("Digite um número entre 1 e 12");
                System.out.print("Número: ");
                opcao = s.nextInt();
                s.nextLine();
                switch (opcao) {
                    case 1 ->
                        System.out.println("O número digitado corresponde ao mês de Janeiro");
                    case 2 ->
                        System.out.println("O número digitado corresponde ao mês de Fevereiro");
                    case 3 ->
                        System.out.println("O número digitado corresponde ao mês de Março");
                    case 4 ->
                        System.out.println("O número digitado corresponde ao mês de Abril");
                    case 5 ->
                        System.out.println("O número digitado corresponde ao mês de Maio");
                    case 6 ->
                        System.out.println("O número digitado corresponde ao mês de Junho");
                    case 7 ->
                        System.out.println("O número digitado corresponde ao mês de Julho");
                    case 8 ->
                        System.out.println("O número digitado corresponde ao mês de Agosto");
                    case 9 ->
                        System.out.println("O número digitado corresponde ao mês de Setembro");
                    case 10 ->
                        System.out.println("O número digitado corresponde ao mês de Outubro");
                    case 11 ->
                        System.out.println("O número digitado corresponde ao mês de Novembro");
                    case 12 ->
                        System.out.println("O número digitado corresponde ao mês de Dezembro");
                    default ->
                        System.out.println("O número digitado não corresponde à nenhum mês, tente novamente");
                }
            }
            case 3 -> {
                System.out.println("Bem vindo(a) ao programa que verifica se a letra digitada é Vogal ou Consoante");
                System.out.print("Digite uma letra: ");
                char ch = s.next().charAt(0);
                switch (ch) {
                    case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' ->
                        System.out.println("A letra digitada é uma VOGAL");
                    default ->
                        System.out.println("A letra digitada é uma CONSOANTE");
                }
            }
            case 4 -> {
                System.out.println("Bem vindo(a) ao programa que verifica se o número está entre 1 e 3");
                System.out.print("Ditite um número entre 1 e 3: ");
                opcao = s.nextInt();
                s.nextLine();
                switch (opcao) {
                    case 1 -> {
                        System.out.println("O número digitado é 1");
                    }
                    case 2 ->
                        System.out.println("O número digitado é 2");
                    case 3 -> {
                        System.out.println("O número digitado é 3");
                        if (opcao > 2) {
                            System.out.println("Número maior que 2");
                        } else {
                            System.out.println("Número não é maior que 2");
                        }
                    }
                    default ->
                        System.out.println("Número digitado está fora do alcance entre 1 e 3");
                }
            }
            default -> {
                System.out.println("Número digitado não corresponde a nenhum exercício!");
            }
        }
    }
}
