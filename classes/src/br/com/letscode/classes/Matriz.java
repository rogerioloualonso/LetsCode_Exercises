package br.com.letscode.classes;

public class Matriz {

    public static void main (String[] args){

        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int i = 0; i < matriz.length; i++) {
            System.out.print("\n| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.print("|");
        }
    }
}
