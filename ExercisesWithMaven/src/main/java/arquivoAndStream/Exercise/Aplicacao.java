package arquivoAndStream.Exercise;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static arquivoAndStream.Exercise.Premiacao.*;

public class Aplicacao {

    public static void main(String[] args) {

        Aplicacao app = new Aplicacao();

        List<Premiacao> oscarMale = new ArrayList<>();
        List<Premiacao> oscarFemale = new ArrayList<>();

        //Lendo os arquivos csv
        app.readFile(oscarMale, "oscarMale.csv");
        app.readFile(oscarFemale, "oscarFemale.csv");

        //Questão 1
        System.out.printf("\n\nO ator mais jovem foi ");
        atorMaisJovem(oscarMale);

        //Questão 2
        System.out.printf("\nA Atriz mais premiada foi ");
        atrizMaisPremiada(oscarFemale);

        //Questão 3
        System.out.printf("\nA Atriz mais premiada entre 20 e 30 anos foi ");
        atrizMaisPremiadafiltrada(oscarFemale);

        //Questão 4
        System.out.println("\n*** Lista de atores que receberam mais de um oscar ***");
        maisDeUmOscar(oscarMale, oscarFemale);

        //Questão 4
        String nome = "Katharine Hepburn";
        System.out.printf("\n*** %s ***:\n", nome);
        resumoAtor(oscarMale, oscarFemale, nome);


    }

    private void readFile(List<Premiacao> premios, String filename){

        String filepath = getFilepathFromResourceAsStream(filename);
        try (Stream<String> stream = Files.lines(Path.of(filepath))) {
            List<String> lines = stream.skip(1).collect(Collectors.toList());
            for (String line : lines) {
                String[] info = line.split("; ");
                Premiacao newPremio = new Premiacao(Integer.parseInt(info[0]),Integer.parseInt(info[1]), Integer.parseInt(info[2]),
                        info[3], info[4]);
                premios.add(newPremio);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFilepathFromResourceAsStream(String fileName) {
        URL url = getClass().getClassLoader().getResource(fileName);
        File file = new File(url.getFile());
        return file.getPath();
    }
}
