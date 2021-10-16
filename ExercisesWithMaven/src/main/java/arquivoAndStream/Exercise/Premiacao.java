package arquivoAndStream.Exercise;

import lombok.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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

    public static Premiacao fromLine(String line) {
        String[] split = line.split("; ");
        return new Premiacao(
                Integer.parseInt(split[0]),
                Integer.parseInt(split[1]),
                Integer.parseInt(split[2]),
                split[3],
                split[4]
        );
    }



    public static void atorMaisJovem(List<Premiacao> premios){

        Optional<Premiacao> premiacaoOptional = premios.stream()
                .min(Comparator.comparingInt(p -> p.getAge()));
        premiacaoOptional.ifPresent(p -> System.out.println(p.getName()));
    }

    public static void atrizMaisPremiada(List<Premiacao> premios){


    }
}


