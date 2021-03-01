public class Cat {

    String name;
    int appetite;
    boolean bellyful;

    Cat (String name, int appetite, boolean bellyful) {
        this.name = name;
        this.appetite = appetite;
        this.bellyful = bellyful;
    }

    void eat (Plate plate) {
        if (isEnoughFood(plate)) {
            plate.decreaseFood(appetite);
            bellyful = true;
        }
    }

    private boolean isEnoughFood(Plate plate) {
        return appetite <= plate.food;
    }

    private static  String bellyfulToString (boolean bellyful) {
        if (bellyful)
            return "сыт";
        else
            return "голоден";
    }

    void showCatInfo () {
        System.out.println("Кот " + name + " с аппетитом " + appetite + " " + bellyfulToString(bellyful) );
    }
}
