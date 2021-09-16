package br.com.letscode.classes;

public class Calculator {

    public static void main (String[] args){

        int a = 2, b = 3;

        //Soma
        System.out.println(a + b);
        //subtração
        System.out.println(a - b);
        //multiplicacao
        System.out.println(a * b);
        //divisao
        double resultado = (double) a / b;
        System.out.println(resultado);

        //desafio
        //se cada termo é par
        //qual o maior deles

        if((a % 2 == 0) && (b % 2 == 0)){
            if(a > b){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
        }else if((a % 2 == 0) || (b % 2 == 0)){
            System.out.println("Um termo não é par");
        }else{
            System.out.println("Os dois termos não são par");
        }

    }
}
