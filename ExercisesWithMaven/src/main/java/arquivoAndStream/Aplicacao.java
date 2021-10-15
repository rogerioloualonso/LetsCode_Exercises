package arquivoAndStream;

import java.util.ArrayList;
import java.util.List;

import static arquivoAndStream.Premiacao.readFile;

public class Aplicacao {

    public static void main(String[] args) {

        List<Premiacao> premiosMale = new ArrayList<>();
        List<Premiacao> premiosFemale = new ArrayList<>();
        readFile(premiosMale, "oscar_male.csv");
        readFile(premiosFemale, "oscar_female.csv");

        for(Premiacao premio: premiosMale){
            System.out.println(premio);
        }

        for(Premiacao premio: premiosFemale){
            System.out.println(premio);
        }


    }
}
