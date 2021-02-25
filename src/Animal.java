public class Animal {

    String name;
    int maxRunDistance;
    int maxSwimDistance;

    public Animal (String name) {
        this.name = name;
    }

    void run (int distance){
        if (0<distance && distance<=maxRunDistance)
            System.out.println(name + " пробежал " + distance + " метров.");
        else
            System.out.println("Не верно задана дистанция бега, " + name + " может пробежать от 0 до " + maxRunDistance + " метров");

    }

    void swim (int distance){
        if (0<distance && distance<maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " метров.");
        }
        else {
            System.out.println("Не верно задана дистанция плавания, " + name + " может проплыть от 0 до " + maxSwimDistance + " метров");
        }
    }

}
