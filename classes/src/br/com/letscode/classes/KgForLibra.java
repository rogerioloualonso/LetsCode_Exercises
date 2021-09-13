package br.com.letscode.classes;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class KgForLibra {

    public static void main(String[] args) {
        int x = 10;
        String nome = "Roger";
        System.out.println("Consegui rodar!\nNota: " + x + "!");
        System.out.println(nome);

        boolean sextou = false;
        boolean zeroDuvidas = true;
        boolean exercicioFeito = true;

        sextou = zeroDuvidas && exercicioFeito;


        if(sextou){
            System.out.println("Show!Sextamos!");
        }else{
            System.out.println("Deu ruim!Estude...");
        }

        System.out.println(DaysOfWeek.MONDAY);
        DayOfWeek dow = LocalDate.now().getDayOfWeek();
        System.out.println(dow);
    }
}
