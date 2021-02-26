import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameMenu {

    static void gameMenu() throws IOException {
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
                    GuessNumberGame.guessNumberGame();
                    continue gameMenu;
                } else if (s.equals("2")) {
                    GuessWordGame.guessWordGame();
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
}