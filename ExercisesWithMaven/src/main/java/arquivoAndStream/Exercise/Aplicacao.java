package arquivoAndStream.Exercise;

import java.util.ArrayList;
import java.util.List;

import static arquivoAndStream.Exercise.Premiacao.*;

public class Aplicacao {

    public static void main(String[] args) {

        //Lendo os arquivos csv
        List<Premiacao> premiosMale = new ArrayList<>();
        List<Premiacao> premiosFemale = new ArrayList<>();
        readFile(premiosMale, "oscar_male.csv");
        readFile(premiosFemale, "oscar_female.csv");

        //Guardando os dados separado por pessoa
        //List<Ator> premiados = new ArrayList<>();
        //addAtor(premiados, premiosMale);
        //addAtor(premiados, premiosFemale);

        System.out.printf("\n\nO ator mais jovem foi %s.\n", youngActor(premiosMale));
        atrizMaisPremiada(premiosFemale);

    }
}
