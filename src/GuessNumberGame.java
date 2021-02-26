import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static void guessNumberGame() {
        System.out.println("\nДобро пожаловать в игру \"Числогадайка\"!" +
                "\nПравила просты: нужно угадать число от 0 ло 9. На это у вас будет 3 попытки." +
                "\nДля выхода в меню выбора игры в любой момент введите exit" +
                "\nИтак приступим!\n");
        Random random = new Random();
        int rng = 0;
        for (int i = 1; i <= 3; i++) {

            if (i == 1)
                rng = random.nextInt(10);

            System.out.println("Ведите число, " + i + " попытка:");
            int answer = inputNumberGuess(0, 10);

            if (answer == rng) {
                System.out.println("\nПоздравляем, вы угадали верно.");
                i = continueNumberGuess();

            } else if (answer == -1)
                break;

            else {
                if (i == 3) {
                    System.out.println("\nПопыток больше нет. Вы проиграли.");
                    i = continueNumberGuess();
                } else if (answer > rng)
                    System.out.println("\nВы не угадали, загаданое число меньше " + answer);
                else
                    System.out.println("\nВы не угадали, загаданое число больше " + answer);
            }
        }
    }

    static int continueNumberGuess() {
        System.out.println("\nХотите попробывать еще раз?\n" +
                "1.Да\n" +
                "2.Нет или exit");
        int i;
        if (inputNumberGuess(1, 3) == 1)
            i = 0;
        else
            i = 3;
        return i;
    }

    static int inputNumberGuess(int min, int max) {
        int temp;
        do {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext("^(?i)exit$")) {   //паттерн чесно стырен со стекоферфлоу
                temp = -1;
                break;
            } else if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                if (min <= temp && temp < max)
                    break;
                else
                    System.out.println("Такой вариант отсутствует, попробуйте еще раз:");
            } else
                System.out.println("Это не число, попробуйте еще раз:");
            scanner.close();
        } while (true);

        return temp;
    }
}