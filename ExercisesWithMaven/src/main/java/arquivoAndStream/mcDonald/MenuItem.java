package arquivoAndStream.mcDonald;

import lombok.*;

import static java.lang.Integer.parseInt;

//Category,Item,Serving Size,Calories,Calories from Fat,Total Fat,Total Fat (% Daily Value),
// Saturated Fat,Saturated Fat (% Daily Value),Trans Fat,Cholesterol,Cholesterol (% Daily Value),
// Sodium,Sodium (% Daily Value),Carbohydrates,Carbohydrates (% Daily Value),Dietary Fiber,
// Dietary Fiber (% Daily Value),Sugars,Protein,Vitamin A (% Daily Value),Vitamin C (% Daily Value),
// Calcium (% Daily Value),Iron (% Daily Value)

@Value
public class MenuItem {

    String category;
    String name;
    String servingSize;
    Integer calories;
    Double totalFat;
    Integer sodium;
    Integer carbohydrates;
    Integer protein;


    public static MenuItem fromLine(String line){
        String[] split = line.split(",(?=\\$)");

        return new MenuItem(
                split[0],
                split[1].replace("\"", ""),
                split[2],
                parseInt(split[3]),
                Double.parseDouble(split[5]),
                parseInt(split[12]),
                parseInt(split[14]),
                parseInt(split[19])
        );
    }

}
