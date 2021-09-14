package br.com.letscode.listas;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Lista3 {

    public static void questao1(){

        /*Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras. Ao final da entrada dos 5 itens, exiba a lista completa.*/

        final int TAM = 5;

        Scanner sc = new Scanner(System.in);
        String[] carrinho = new String[5];

        for(int i = 0; i < TAM; i++){
            System.out.printf("Digite o nome de uma fruta:");
            carrinho[i] = sc.nextLine();
        }

        System.out.println("**** Lista completa ****");

        for(int i = 0; i < TAM; i++){
            System.out.printf("%d - %s;\n", i + 1, carrinho[i]);
        }

        sc.close();
    }

    public static void questao2(){

        /*Escreva um programa que lê uma palavra e a escreve de volta ao contrário.*/

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite uma palavra:");
        String word = sc.nextLine();

        System.out.printf("%s ao contrário é ", word);

        for(int i = word.length() - 1; i >= 0; i--){
            System.out.printf("%c", word.charAt(i));
        }
        System.out.printf(".");

        sc.close();
    }

    public static void questao3(){

        /*Escreva um programa que lê 5 números. Ao final, escreva primeiros todos os ímpares, depois todos os pares.*/

        final int TAM = 5;

        Scanner sc = new Scanner(System.in);
        int[] number = new int[TAM];

        for(int i = 0; i < TAM; i++){
            System.out.printf("\nDigite um número inteiro:");
            number[i] = sc.nextInt();
        }
        System.out.printf("\n\n**** Números ímpares ****");
        for(int i = 0; i < TAM; i++){
            if(number[i] % 2 != 0){
                System.out.println(number[i]);
            }
        }

        System.out.printf("\n\n**** Números pares ****");
        for(int i = 0; i < TAM; i++){
            if(number[i] % 2 == 0){
                System.out.println(number[i]);
            }
        }

        sc.close();
    }

    public static void questao4(){

        /*Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.*/

        final int TAM = 5;
        float numbers[] = new float[TAM];
        float soma = 0, maior = 0, menor = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < TAM; i++){
            System.out.printf("\nDigite um número: ");
            numbers[i] = sc.nextFloat();
            soma += numbers[i];

            if(i == 0){
                maior = numbers[i];
                menor = numbers[i];
            }else{
                if(numbers[i] > maior){
                    maior = numbers[i];
                }else if(numbers[i] < menor){
                    menor = numbers[i];
                }
            }
        }

        float media = soma/TAM;

        System.out.println("");

        System.out.println("O maior é " + maior);
        System.out.println("O menor é " + menor);
        System.out.println("A média dos valore é " + media);

        sc.close();
    }

    public static void questao5(){

        /*Escreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados. Ao final, informe qual o nome mais longo presente na lista.*/

        final int TAM = 5;
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[TAM];
        String maior = "";

        for(int i = 0; i < TAM; i++) {
            System.out.printf("\nDigite um nome:");
            nome[i] = sc.nextLine();
            if (nome[i].length() > maior.length()) {
                maior = nome[i];
            }
        }
        System.out.printf("\n\nA maior palavra foi '%s'.", maior);

        sc.close();
    }

    public static void questao6(){

        /*Escreva um programa que lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo.*/

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite uma palavra:");
        String word = sc.nextLine();

        System.out.printf("\n\nNova palavra: ");

        for(int i = 0; i < word.length(); i++){
            if(i % 2 == 0){
                System.out.printf("%s", word.charAt(i));
            }else{
                String x = "" + word.charAt(i);
                System.out.printf("%s", x.toUpperCase());
            }
        }
        sc.close();
    }

    public static void questao7(){

        /*Escreva um programa que lê nome e idade de 5 pessoas e ao final informa quem é o mais novo, o mais velho e qual a média de idade.*/

        final int TAM = 5;

        Scanner sc = new Scanner(System.in);
        String[] nome = new String[TAM];
        int[] idade = new int[TAM];
        float soma = 0;
        int velho = 0, novo = 0;

        for(int i = 0; i < TAM; i++){
            System.out.printf("\nDigite o nome:");
            nome[i] = sc.nextLine();

            System.out.printf("\nDigite a idade:");
            idade[i] = sc.nextInt();
            sc.nextLine();

            soma += idade[i];

            if(idade[i] > idade[velho]){
                velho = i;
            }else if(idade[i] < idade[novo]){
                novo = i;
            }
        }

        float media = (float) soma/TAM;

        System.out.printf("\n\nO mais novo é %s e tem %d anos.", nome[novo], idade[novo]);
        System.out.printf("\nO mais velho é %s e tem %d anos.", nome[velho], idade[velho]);
        System.out.printf("\nA média das idades foi de %.2f.", media);

        sc.close();
    }

    public static void questao8(){

        /*Escreva um programa que lê nome e peso de 5 pessoas, calcula o IMC de cada um e ao final informa se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25).*/

        final int TAM = 2;
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[TAM];
        float[] peso = new float[TAM];
        float[] altura = new float[TAM];
        float[] imc = new float[TAM];

        for(int i = 0; i < TAM; i++){
            System.out.printf("\nDigite o nome da pessoa:");
            nome[i] = sc.nextLine();
            System.out.printf("\nDigite o peso:");
            peso[i] = sc.nextFloat();
            System.out.printf("\nDigite a altura:");
            altura[i] = sc.nextFloat();
            sc.nextLine();

            imc[i] = peso[i] / (altura[i] * altura[i]);
        }

        for(int i = 0; i < TAM; i++){
            if((imc[i] < 18.5) || (imc[i] > 25)){
                System.out.printf("\n\n%s está fora do peso ideal.", nome[i]);
            }
        }

        sc.close();
    }


    public static void main(String[] args){

        //questao1();
        //questao2();
        //questao3();
        //questao4();
        //questao5();
        //questao6();
        //questao7();
        //questao8();

    }
}
