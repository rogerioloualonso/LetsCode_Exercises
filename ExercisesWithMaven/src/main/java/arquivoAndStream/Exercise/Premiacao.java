package arquivoAndStream.Exercise;

import lombok.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
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
        premiacaoOptional.ifPresent(p -> System.out.printf(p.getName()));
    }

    public static void atrizMaisPremiada(List<Premiacao> premios){

        premios.stream()
                .collect(Collectors.groupingBy(Premiacao :: getName, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(s -> System.out.printf(s.getKey()));
    }

    public static void atrizMaisPremiadafiltrada(List<Premiacao> premios){

        premios.stream()
                .filter(s -> s.getAge() >= 20 && s.getAge() <= 30)
                .collect(Collectors.groupingBy(Premiacao :: getName, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(s -> System.out.println(s.getKey()));
    }

    public static void maisDeUmOscar(List<Premiacao> male, List<Premiacao> female){

        Stream<Premiacao> streamMale = male.stream();
        Stream<Premiacao> streamFemale = female.stream();

        Stream.concat(streamFemale, streamMale)
                .collect(Collectors.groupingBy(Premiacao :: getName, Collectors.counting()))
                .entrySet()
                .stream().filter(s -> s.getValue() > 1)
                .forEach(s -> System.out.println("\t\t\t\t" + s.getKey()));
    }

    public static void resumoAtor(List<Premiacao> male, List<Premiacao> female, String name){

        numOscar(male, female, name);

        Stream<Premiacao> streamMale = male.stream();
        Stream<Premiacao> streamFemale = female.stream();

        Stream<Premiacao> dadosOscar = Stream.concat(streamFemale, streamMale);

        dadosOscar
                .filter(s -> s.getName().equals(name))
                .forEach(s -> System.out.printf("\t\nano: %d idade: %d filme: %s", s.getYear(), s.getAge(),
                        s.getMovie()));
    }

    private static void numOscar(List<Premiacao> male, List<Premiacao> female, String name){

        Stream<Premiacao> streamMale = male.stream();
        Stream<Premiacao> streamFemale = female.stream();

        Stream<Premiacao> contOscar = Stream.concat(streamFemale, streamMale);

        long quant = contOscar
                .filter(s -> s.getName().equals(name))
                .count();

        System.out.println("\tRecebeu " + quant + " Oscar(s).");

    }
}


