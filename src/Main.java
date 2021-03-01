
//Статик толко в 1 месте придумал куда воткнуть, остальное так или иначе относится к сущности объектов...

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //создаем тарелку + добавляем еды, считаем что тарелка бездонная )
        Plate plate = new Plate(20);
        plate.addFood(29);

        //Создаем масив котов
        String[] names = {"Васька", "Маська", "Муська", "Кузька", "Бегемот"};
        Random random = new Random();
        //будем считать что количество котов в масиве зависит от количества имен
        Cat[] cat = new Cat[names.length];
        for (int i = 0; i < cat.length; i++) {
            int rng = random.nextInt(20);
            cat[i] = new Cat(names[i], rng, false);
        }

        //Кормим котов
        for (Cat value : cat) {
            value.eat(plate);
        }

        //Смотрим, остался ли кто голодный
        for (Cat value : cat) {
            if (!value.bellyful) {
                value.showCatInfo();
            }
        }

        plate.showFoodInPlate();
    }
}