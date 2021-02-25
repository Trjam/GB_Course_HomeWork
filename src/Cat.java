public class Cat extends Animal {

    public Cat (String name) {
        super(name);
        super.maxRunDistance = 200;
    }

    @Override
    void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }
}
