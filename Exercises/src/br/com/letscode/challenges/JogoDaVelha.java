package br.com.letscode.challenges;

import java.util.Scanner;

public class JogoDaVelha {

    public static void imprimir(char[][] matriz){
        System.out.println("** JOGO DA VELHA **");
        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 3; j++){
                System.out.printf("\t%c", matriz[i][j]);
            }
        }
    }

    public static void alterar(char[][] jogo, int lin, int col, char valor){
        jogo[lin][col] = valor;
    }

    public static void jogada(int jogador, char[][] jogo, char valor){
        var key = 0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.printf("\t\n\nJogador nº %d" , jogador);
            System.out.printf("\nQual linha? R:");
            int linha = sc.nextInt();
            System.out.printf("\nQual coluna? R:");
            int coluna = sc.nextInt();

            if(jogo[linha][coluna] == '_'){
                alterar(jogo, linha, coluna, valor);
                key = 0;
            }else{
                System.out.println("Você não pode jogar aqui.");
            }
        }while(key == 1);
    }

    public static int vitoria(char[][] jogo, char valor, int jogador){
        if((jogo[0][0] == valor) && (jogo[1][1] == valor) && (jogo[1][1] == valor)){
            System.out.printf("\n\n*** Jogador nº %d ganhou!!! ***", jogador);
            return 0;
        }else if((jogo[0][2] == valor) && (jogo[1][1] == valor) && (jogo[2][0] == valor)){
            System.out.printf("\n\n*** Jogador nº %d ganhou!!! ***", jogador);
            return 0;
        }else if((jogo[0][0] == valor) && (jogo[0][1] == valor) && (jogo[0][2] == valor)){
            System.out.printf("\n\n*** Jogador nº %d ganhou!!! ***", jogador);
            return 0;
        }else if((jogo[1][0] == valor) && (jogo[1][1] == valor) && (jogo[1][2] == valor)){
            System.out.printf("\n\n*** Jogador nº %d ganhou!!! ***", jogador);
            return 0;
        }else if((jogo[2][0] == valor) && (jogo[2][1] == valor) && (jogo[2][2] == valor)){
            System.out.printf("\n\n*** Jogador nº %d ganhou!!! ***", jogador);
            return 0;
        }else if((jogo[0][0] == valor) && (jogo[1][0] == valor) && (jogo[2][0] == valor)){
            System.out.printf("\n\n*** Jogador nº %d ganhou!!! ***", jogador);
            return 0;
        }else if((jogo[0][1] == valor) && (jogo[1][1] == valor) && (jogo[2][1] == valor)){
            System.out.printf("\n\n*** Jogador nº %d ganhou!!! ***", jogador);
            return 0;
        }else if((jogo[0][2] == valor) && (jogo[1][2] == valor) && (jogo[2][2] == valor)){
            System.out.printf("\n\n*** Jogador nº %d ganhou!!! ***", jogador);
            return 0;
        }else{
            return 1;
        }
    }

    public static void main(String[] args){

        char[][] jogo = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
        char simbolo1 = 'X';
        char simbolo2 = 'O';
        var chave = 1;
        var cont = 0;

        imprimir(jogo);

        do{
            jogada(1, jogo, simbolo1);
            imprimir(jogo);
            chave = vitoria(jogo, simbolo1, 1);
            if (chave == 0) {
                continue;
            }
            chave = vitoria(jogo, simbolo2, 2);
            if (chave == 0){
                continue;
            }
            cont++;
            jogada(2, jogo, simbolo2);
            imprimir(jogo);
            chave = vitoria(jogo, simbolo1, 1);
            if (chave == 0){
                continue;
            }
            chave = vitoria(jogo, simbolo2, 2);
            cont++;

            if(cont == 7){
                System.out.println("*** Deu velha ***");
            }

        }while(chave == 1 && cont < 7);

    }
}
