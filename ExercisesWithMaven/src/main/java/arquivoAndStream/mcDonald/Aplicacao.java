package arquivoAndStream.mcDonald;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Aplicacao {

    private List<MenuItem> menuItens;

    public static void main(String[] args) {

        Aplicacao app = new Aplicacao();
        app.testeLeituraArquivoCsv();
        app.findHamburguerMaisCalorico("Beef & Pork");

    }

    public void findHamburguerMaisCalorico(String category){
        this.menuItens.stream()
                .filter(item -> item.getCategory().equals(category))
                .max(Comparator.comparingInt(item -> item.getCalories()))
                .ifPresent(System.out::println);
    }

    private void testeLeituraArquivoCsv() {
        String path = getFileOPath("menu.csv");
        try(Stream<String> lines = Files.lines(Path.of(path))){
            this.menuItens = lines
                    .skip(1)
                    .map(MenuItem::fromLine)
                    .toList();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getFileOPath(String fileName){
        URL url = getClass().getClassLoader().getResource(fileName);
        File file = new File(url.getFile());
        return file.getPath();
    }
}
