package br.com.letscode.challenges;

public class OrganizeArray {

    //desafio: checar se existem posteriores nulos e mover todos os elementos necessários até ocupar o inicio do array

    public static void organize(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == 0){
                for(int j = i; j < vetor.length - i; j++) {
                    if (j == vetor.length - 1) {
                        vetor[j] = 0;
                        continue;
                    }
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = 0;
                }
            }
        }
    }


    public static void main(String[] args){

        int[] vet = new int[3];

        vet[0] = 2;
        vet[1] = 0;
        vet[2] = 1;

        System.out.println("*** Vetor com valor nulo ***");

        for(int item : vet){
            System.out.println(item);
        }

        System.out.println("*** Vetor sem valor nulo ***");

        organize(vet);

        for(int item : vet){
            System.out.println(item);
        }


    }
}
