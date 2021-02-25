public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Бегемот");
        Dog dog = new Dog("Пёс");

        cat.run(210);
        cat.swim(5);

        System.out.println();

        dog.run(300);
        dog.swim(11);

        Animal[] animals = {cat,dog};

        System.out.println();

        int catCount = 0;
        int dogCount = 0;
        int animalCount = 0;

        for (Animal animal : animals) {
            if (animal instanceof Cat)
                catCount++;
            else if (animal instanceof Dog)
                dogCount++;
            animalCount++;
        }

        System.out.println("Котов:" + catCount +
                "\nСобак: " + dogCount +
                "\nВсего животных:" + animalCount);

    }
}
