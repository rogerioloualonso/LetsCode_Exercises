package br.com.letscode.listas.lista4;

import java.util.Scanner;

public class Lista4 {

    public static final int TAM = 5;

    public static void QuestaoSete(){

        /*Escreva um programa que lê nome e idade de 5 pessoas e ao final informa quem é o mais novo, o mais velho e qual a média de idade.*/

        Scanner sc = new Scanner(System.in);
        Pessoa[] grupo = new Pessoa[TAM];
        int dados[] = new int[5];

        for(int i = 0; i < TAM; i++){
            System.out.printf("\n\nDigite o nome da %dª pessoa:", i + 1);
            String nome = sc.nextLine();
            System.out.printf("\nDigite a idade da %dª pessoa:", i + 1);
            int idade = sc.nextInt();
            sc.nextLine();
            grupo[i] = new Pessoa(nome, idade);
        }


        dados[3] = grupo[0].getIdade();

        for(int i = 0; i < TAM; i++){
            dados[0] = dados[0] + grupo[i].getIdade();

            if(grupo[i].getIdade() > dados[1]){
                dados[1] = grupo[i].getIdade();
                dados[2] = i;
            }

            if(grupo[i].getIdade() < dados[3]){
                dados[3] = grupo[i].getIdade();
                dados[4] = i;
            }
        }

        float media = (float)dados[0] / TAM;

        System.out.printf("\n\nA média das idades foi de %.2f.", media);
        System.out.printf("\nO mais velho foi %s com %d anos.", grupo[dados[2]].getNome(), grupo[dados[2]].getIdade());
        System.out.printf("\nO mais novo foi %s com %d anos.", grupo[dados[4]].getNome(), grupo[dados[4]].getIdade());

    }

    public static void QuestaoOito(){

        /*Escreva um programa que lê nome, peso e altura de 5 pessoas, calcula o IMC de cada um e ao final informa se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25).*/

        Scanner sc = new Scanner(System.in);
        DadosIMC[] dados = new DadosIMC[TAM];

        for(int i = 0; i < TAM; i++){
            System.out.printf("\n\nDigite o nome da %dª pessoa:", i + 1);
            String nome = sc.nextLine();
            System.out.printf("\n\nDigite o peso da %dª pessoa (em Kg):", i + 1);
            float peso = sc.nextFloat();
            System.out.printf("\n\nDigite a altura da %dª pessoa(em metro):", i + 1);
            float altura = sc.nextFloat();
            sc.nextLine();

            dados[i] = new DadosIMC(nome, peso, altura);

            System.out.println(dados[i].toString());
        }

        System.out.println();

        for(int i = 0; i < TAM; i++){
            if(dados[i].imc() < 18.5 || dados[i].imc() > 25){
                System.out.printf("%s está acima do peso.\n", dados[i].getNome());
            }
        }
    }

    public static void main(String[] args){
        //QuestaoSete();
        //QuestaoOito();
    }
}
