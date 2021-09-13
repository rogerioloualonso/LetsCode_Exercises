package br.com.letscode.classes;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import static java.time.format.TextStyle.*;

public class PatternProject {

    static final Locale LOCAL = new Locale("pt", "BR");
    static final DayOfWeek dow = LocalDate.now().getDayOfWeek();

    static void printDiaSemana(TextStyle estilo){
        String diaSemana = dow.getDisplayName(estilo,LOCAL);//pt-BR
        System.out.println(diaSemana);
    }

    public static void main(String[] args) {

        printDiaSemana(FULL);
        printDiaSemana(SHORT);
        printDiaSemana(NARROW);
        printDiaSemana(FULL_STANDALONE);
        printDiaSemana(SHORT_STANDALONE);
    }


}
