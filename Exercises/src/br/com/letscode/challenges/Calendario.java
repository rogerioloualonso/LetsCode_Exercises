package br.com.letscode.challenges;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

//Dada uma data yyyy-MM-dd, Dada uma data na forma yyyy-MM-dd, imprima o calendário daquele mês

public class Calendario {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite uma data (yyyy-MM-dd):");
        String date = sc.nextLine();
        LocalDate localdate = LocalDate.parse(date);

        String mes = localdate.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));

        System.out.printf("\n\nCalendário de %s de %d:\n\n", mes, localdate.getYear());

        System.out.printf("\tseg\tter\tqua\tqui\tsex\tsab\tdom\n");

        LocalDate aux = localdate.withDayOfMonth(01);

        var space = 0;

        if(aux.getDayOfWeek().getValue() == 2){
            System.out.printf("\t");
            space = 1;
        }else if(aux.getDayOfWeek().getValue() == 3){
            System.out.printf("\t\t");
            space = 2;
        }else if(aux.getDayOfWeek().getValue() == 4){
            System.out.printf("\t\t\t");
            space = 3;
        }else if(aux.getDayOfWeek().getValue() == 5){
            System.out.printf("\t\t\t\t");
            space = 4;
        }else if(aux.getDayOfWeek().getValue() == 6){
            System.out.printf("\t\t\t\t\t");
            space = 5;
        }else if(aux.getDayOfWeek().getValue() == 7){
            System.out.printf("\t\t\t\t\t\t");
            space = 6;
        }

        for(int i = space; i < localdate.lengthOfMonth(); i++){
            System.out.printf("\t%d", (i - space) + 1);
            if((i == 6) || (i==13) || (i == 20) || (i == 27) || ( i == 34)){
                System.out.println();
            }
        }

    }

}
