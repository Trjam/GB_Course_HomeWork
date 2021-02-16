import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Доброго времени суток.");
        gameMenu();

    }
    /*******************************************************************************************************************
     Чуток усложнил себе задачку, хорошо бы по трем классам раскидать конечно,
     но пока так оставлю, чтоб проверять удобнее было
     TODO класс GameMenu Начало
     ******************************************************************************************************************/
    private static void gameMenu() throws IOException {
        gameMenu:
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nВведите номер игры, которую желаете запустить:" +
                    "\n1.Числогадайка" +
                    "\n2.Словогадайка" +
                    "\nДля выхода введите exit");
            String s;
            do {
                s = reader.readLine();
                if (s.equals("1")) {
                    guessNumberGame();
                    continue gameMenu;
                } else if (s.equals("2")) {
                    guessWordGame();
                    continue gameMenu;
                } else if (s.equalsIgnoreCase("exit")) {
                    System.out.println("\nВсего хорошего!");
                    return;
                } else {
                    System.out.println("Вы ввели неккоректное значение, попробуйте еще раз:");
                }
            } while (true);
        }
    }
    /*******************************************************************************************************************
     класс GameMenu конец
     *******************************************************************************************************************
     TODO класс GuessNumberGame начало
     ******************************************************************************************************************/

    private static void guessNumberGame() {
        System.out.println("\nДобро пожаловать в игру \"Числогадайка\"!" +
                "\nПравила просты: нужно угадать число от 0 ло 9. На это у вас будет 3 попытки." +
                "\nДля выхода в меню выбора игры в любой момент введите exit" +
                "\nИтак приступим!\n");
        Random random = new Random();
        int rng=0;
        for (int i = 1; i <= 3; i++) {

            if (i==1)
                rng = random.nextInt(10);

            System.out.println("Ведите число, " + i + " попытка:");
            int answer = inputNumberGuess(0, 10);

            if (answer == rng) {
                System.out.println("\nПоздравляем, вы угадали верно.");
                i= continueNumberGuess();

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


    private static int continueNumberGuess() {
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


    private static int inputNumberGuess(int min, int max) {
        int temp;
        do {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext("^(?i)exit$")) {   //паттерн чесно стырен со стекоферфлоу
                temp = -1;
                scanner.close();
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

    /*******************************************************************************************************************
     класс GuessNumberGame конец
     *******************************************************************************************************************
     TODO класс GuessWordGame начало
     ******************************************************************************************************************/

    private static void guessWordGame() throws IOException {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("\nДобро пожаловать в игру \"Словогадайка\"!" +
                "\nПравила просты: нужно угадать загаданное слово" +
                "\nСписок доступных слов можно вывести командой words" +
                "\nДля выхода в меню выбора игры в любой момент введите exit" +
                "\nИтак приступим!");
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String s;
        Random random = new Random();
        String secretWord = words[random.nextInt(25)];
        do {
            s = reader.readLine();
            if (s.equalsIgnoreCase("exit"))
                return;
            else if (s.equalsIgnoreCase("words"))
                showWords(words);
            else if (tryGuess(secretWord,s))
                return;
        } while (true);
    }

    private static void showWords(String[] words) {
        for (int i=0; i<words.length; i++) {
            if (i % 5 == 0)
                System.out.print("\n" + words[i] + "\t");
            else
                System.out.print(words[i] + " \t");
        }
        System.out.println("\n");
    }

    private static boolean tryGuess(String secretWord, String s) {
        char[] result = {'X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'};

        for (int i = 0; i<15 ; i++) {
            if (s.toLowerCase().equals(secretWord)) {
                System.out.println("\nПоздравляем, вы победили!");
                return true;
            } else if (s.length()>i&&secretWord.length()>i) {
                char charS=s.charAt(i);
                char charSW=secretWord.charAt(i);
                if (charS == charSW) {
                    result[i]= charSW;
                }
            }
        }
        System.out.println("Вы не угадали слово. Попробуйте еще раз." +
                "\nВот вам подсказка: ниже показано, какие буквы в словах совпали\n" +
                Arrays.toString(result).replace("[","").replace(",","") +
                "\n");
        return false;
    }
    /*******************************************************************************************************************
     класс GuessWordGame конец
     ******************************************************************************************************************/

}
