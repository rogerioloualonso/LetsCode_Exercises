package arquivoAndStream.Exercise;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Ator {

    private String nome;
    private int idade;
    private int qtdPremios;

    public static void addAtor(List<Ator> ator, List<Premiacao> premios){
        //Inserindo sem repetição
        for(Premiacao atual:premios){
            String nome = atual.getName();
            int key = 0;
            for(Ator aux:ator){
                if(aux.getNome() == atual.getName()){
                    key = 1;
                }
            }
            if(key == 0){
                Ator newAtor = new Ator(atual.getName(), atual.getAge(), 1);
                ator.add(newAtor);
            }else{

            }
        }
    }

}
