package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a;
        int b;

        System.out.print("Digite o primeiro valor: ");
        a = scan.nextDouble();
        System.out.print("Digite o segundo valor: ");
        b = scan.nextInt();

        double soma = soma(a, b);
        double subtracao = subtracao(a, b);
        double divisao = divisao(a, b);
        double multiplicacao = multiplicacao(a, b);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(multiplicacao);
    }
    public static double soma(double a, int b) {
        return a + b;
    }

    public static double subtracao(double a, int b) {
        return a - b;
    }

    public static double divisao(double a, int b) {
        return a / b;
    }

    public static double multiplicacao(double a, int b) {
        return a * b;
    }
}
