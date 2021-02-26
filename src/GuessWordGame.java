import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class GuessWordGame {

    public static void guessWordGame() throws IOException {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("\nДобро пожаловать в игру \"Словогадайка\"!" +
                "\nПравила просты: нужно угадать загаданное слово" +
                "\nСписок доступных слов можно вывести командой words" +
                "\nДля выхода в меню выбора игры в любой момент введите exit" +
                "\nИтак приступим!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        Random random = new Random();
        String secretWord = words[random.nextInt(25)];
        do {
            s = reader.readLine();
            if (s.equalsIgnoreCase("exit"))
                return;
            else if (s.equalsIgnoreCase("words"))
                showWords(words);
            else if (tryGuess(secretWord, s))
                return;
        } while (true);
    }

    static void showWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (i % 5 == 0)
                System.out.print("\n" + words[i] + "\t");
            else
                System.out.print(words[i] + " \t");
        }
        System.out.println("\n");
    }

    static boolean tryGuess(String secretWord, String s) {
        char[] result = {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'};

        for (int i = 0; i < 15; i++) {
            if (s.toLowerCase().equals(secretWord)) {
                System.out.println("\nПоздравляем, вы победили!");
                return true;
            } else if (s.length() > i && secretWord.length() > i) {
                char charS = s.charAt(i);
                char charSW = secretWord.charAt(i);
                if (charS == charSW) {
                    result[i] = charSW;
                }
            }
        }
        System.out.println("Вы не угадали слово. Попробуйте еще раз." +
                "\nВот вам подсказка: ниже показано, какие буквы в словах совпали\n" +
                Arrays.toString(result).replace("[", "").replace(",", "") +
                "\n");
        return false;
    }
}