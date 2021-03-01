
//Статик толко в 1 месте придумал куда воткнуть, остальное так или иначе относится к сущности объектов...

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //создаем тарелку + добавляем еды, считаем что тарелка бездонная )
        Plate plate = new Plate(20);
        plate.addFood(30);

        //Создаем масив котов
        String[] names = {"Васька", "Маська", "Муська", "Кузька", "Бегемот"};
        Random random = new Random();
        //будем считать что количество котов в масиве зависит от количества имен
        Cat[] cat = new Cat[names.length];
        for (int i = 0; i < cat.length; i++) {
            int rng = random.nextInt(15)+5;                 //чтобы не было котов питающихся одним воздухом
            cat[i] = new Cat(names[i], rng, false);
        }

        //Кормим котов
        for (Cat value : cat) {
            value.eat(plate);
        }

        //с голодных поправил на всех
        for (Cat value : cat) {
                value.showCatInfo();
        }

        plate.showFoodInPlate();
    }
}