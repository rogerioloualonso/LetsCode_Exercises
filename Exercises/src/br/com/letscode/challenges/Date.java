package br.com.letscode.challenges;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Date{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite uma data(YYYY-MM-DD):");
        String date = sc.nextLine();
        LocalDate localdate = LocalDate.parse(date);

        String mes = localdate.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
        System.out.printf("%s de %s de %s\n", localdate.getDayOfMonth(), mes, localdate.getYear());

        if((localdate.getDayOfWeek().ordinal() == 6) || (localdate.getDayOfWeek().ordinal() == 7)){
            System.out.println("É final de semana!");
        }else{
            System.out.println("Não é final de semana...");
        }

        if(localdate.isLeapYear()){
            System.out.println("O ano é bissexto");
        }else{
            System.out.println("O ano não é bissexto");
        }

    }
}
