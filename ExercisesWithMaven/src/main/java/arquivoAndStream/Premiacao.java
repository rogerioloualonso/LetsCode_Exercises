package arquivoAndStream;

import lombok.Value;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Value

public class Premiacao {
    private int index;
    private int year;
    private int age;
    private String name;
    private String movie;

    public static void readFile(List premios, String filename){

        String folder = "/Documentos/LetsCode/LetsCode_Exercises/ExercisesWithMaven";
        try (Stream<String> stream = Files.lines(Paths.get(System.getProperty("user.home") + folder, filename))) {
            List<String> lines = stream.collect(Collectors.toList());
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

  

}


