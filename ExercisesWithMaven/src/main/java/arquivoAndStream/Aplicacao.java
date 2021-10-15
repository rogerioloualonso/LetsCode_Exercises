package arquivoAndStream;

import java.util.ArrayList;
import java.util.List;

import static arquivoAndStream.Premiacao.*;

public class Aplicacao {

    public static void main(String[] args) {

        //Lendo os arquivos csv
        List<Premiacao> premiosMale = new ArrayList<>();
        List<Premiacao> premiosFemale = new ArrayList<>();
        readFile(premiosMale, "oscar_male.csv");
        readFile(premiosFemale, "oscar_female.csv");

        System.out.printf("\n\nO ator mais jovem foi %s.\n", youngActor(premiosMale));

    }
}
