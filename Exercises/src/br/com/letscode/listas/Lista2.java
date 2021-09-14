package br.com.letscode.listas;

import java.util.Scanner;

public class Lista2 {

    public static void questao1(){

        /*Escreva um programa que recebe dois números inteiros e informa o resultado das operações soma, subtração, multiplicação e divisão. Considere sempre a ordem em que foram informados.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número inteiro:");
        int a = sc.nextInt();

        System.out.print("Insira um número inteiro:");
        int b = sc.nextInt();

        System.out.println("A soma dos valores é: " + (a + b));
        System.out.println("A diferença dos valores é: " + (a - b));
        System.out.println("A multiplicação dos valores é: " + (a * b));
        System.out.println("A divisão dos valores é: " + ( (double) a / b));
    }

    public static void questao2(){

        /*Escreva um programa que informa a tabuada de um número informado (entre 1-10).*/

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número inteiro:");
        int num = sc.nextInt();

        System.out.printf("\n**** Tabuada de %d ****\n", num);
        System.out.printf("\n\t%d X 1 = %d", num, (num * 1));
        System.out.printf("\n\t%d X 2 = %d", num, (num * 2));
        System.out.printf("\n\t%d X 3 = %d", num, (num * 3));
        System.out.printf("\n\t%d X 4 = %d", num, (num * 4));
        System.out.printf("\n\t%d X 5 = %d", num, (num * 5));
        System.out.printf("\n\t%d X 6 = %d", num, (num * 6));
        System.out.printf("\n\t%d X 7 = %d", num, (num * 7));
        System.out.printf("\n\t%d X 8 = %d", num, (num * 8));
        System.out.printf("\n\t%d X 9 = %d", num, (num * 9));
        System.out.printf("\n\t%d X 10 = %d", num, (num * 10));
    }

    public static void questao3(){

        /*Escreva um programa que converte temperaturas de Celsius para Farenheit*/

        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira a temperatura em ºC:");
        double c = sc.nextDouble();

        double f = (c * 9 / 5) + 32;

        System.out.printf("\n%.1f ºC equivale a %.1f ºF.", c, f);
    }

    public static void questao4(){

        /*Escreva um programa que recebe a cotação do dólar do dia e, seguida recebe um valor em reais. A saída é a quantia em dólares. Use formatação de saída para exibir os valores de acordo com cada representação de moeda.*/

        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira a cotação do dólar:US$");
        double dolar = sc.nextDouble();

        System.out.printf("\nInsira o valor em real:R$");
        double real = sc.nextDouble();

        System.out.printf("\nO valor em R$ %.2f equivale a US$ %.2f.", real, (real / dolar));

    }

    public static void questao5(){

        /*Escreva um programa que realiza conversão de medidas de polegadas em centímetros.*/

        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira o tamanho em polegada:");
        double pol = sc.nextDouble();

        System.out.printf("\n%.2f polegada(s) equivale a %.2f cm.", pol, (pol * 2.54));
    }

    public static void main(String[] args) {
        //questao1();
        //questao2();
        //questao3();
        //questao4();
        //questao5();
    }
}
