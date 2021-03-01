public class Plate {

    int food;

    Plate (int food) {
        this.food = food;
    }

    void decreaseFood (int appetite) {
        if (appetite > food)
            return;
        food-=appetite;
    }

    void addFood(int food) {
        this.food+=food;
    }

    void showFoodInPlate () {
        System.out.println("В тарелке осталось " + food + " еды");
    }

}
