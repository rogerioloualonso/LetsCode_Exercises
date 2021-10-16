package arquivoAndStream.Exercise;

import lombok.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

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

    public static String youngActor(List<Premiacao> premios){

        String nome = "Desconhecido";
        int maisNovo = 150;

        for(Premiacao info : premios){
            int idadeAtor = info.getAge();
            if(idadeAtor < maisNovo){
                maisNovo = idadeAtor;
                nome = info.getName();
            }
        }

        return nome;
    }

    public static void atrizMaisPremiada(List<Premiacao> premios){
        String nome = "Desconhecido";
        int qtdMax = 0;

        for(Premiacao num:premios){
            int qtd = 0;

            for(Premiacao i:premios) {
                String aux1 = i.getName();
                String aux2 = num.getName();
                if (aux1.equals(aux2)) {
                    qtd++;
                }
            }

            if(qtd >= qtdMax){
                nome = num.getName();
                qtdMax = qtd;
            }
            qtd = 0;
        }

        System.out.println(nome);
    }
}


