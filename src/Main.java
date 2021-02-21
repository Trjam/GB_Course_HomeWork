import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static int size = 5;
    public static char markX = 'X';
    public static char mark0 = '0';
    public static char emptyCell = '*';
    public static char [][] gameField;
    public static int cellsInLineForWin = 4;
    public static BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Игра крестики нолики." +
                "\nДля победы необходимо заполнить по горизонтали, вертикали или " +
                "\nдиагонали подряд количество ячеек, равное " + cellsInLineForWin + ".\n");

        initMap();
        showGameField();

        do {
            playerTurn();
            if (checkWinCondition(markX)) {
                showGameField();
                System.out.println("\nПоздравляем, вы победили.");
                break;
            }

            algorithmTurn();
            if (checkWinCondition(mark0)) {
                showGameField();
                System.out.println("\nВы проиграли Deep Blue V 0.0.12");
                break;
            }

            if (checkDraw()) {
                showGameField();
                System.out.println("\nНа поле не осталось пустых клеток. Ничья.");
                break;
            }
            showGameField();
        } while (true);
    }

    public static void initMap() {
        gameField = new char[size][size];
        for (int i=0 ; i<size ; i++) {
            for (int j=0 ; j<size ; j++) {
                gameField[i][j] = emptyCell;
            }
        }
    }

    public static void showGameField() {
        for (int i = 0 ; i< size ; i++) {
            if (i==0)
                System.out.print("   ");
            System.out.print(i+1 + "  ");
        }
        System.out.println();

        for (int i = 0 ; i< size ; i++) {
            System.out.print(i+1 + "  ");
            for (int j = 0 ; j < size; j++) {
                System.out.print(gameField[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static boolean checkCell (int x, int y) {

        return gameField[x][y] != emptyCell;

    }

    public static boolean checkWinCondition (char mark) {
        int countD1 , countD2 , countH , countV ;

        //любой размер поля, любые диагоняли... наворотил простыню ифов)
             for (int k = 0; k <= size - cellsInLineForWin ; k++) {
                 countD2 = 1;
                 countD1 = 1;
                for (int i = 0; i < size; i++) {
                    countV = 1;
                    countH = 1;
                    for (int j = 0; j < size; j++) {
                        if (j < size - 1 && i < size - 1 && (j == i - k || j == i + k) && gameField[i][j] == mark) {
                            if (gameField[i + 1][j + 1] != mark)  //
                                countD1=1;
                            else if (gameField[i + 1][j + 1] == mark)
                                countD1++;
                        }
                        if (i < size - 1 && j > 0 && (j == size - 1 - i - k || j == size - 1 - i + k) && gameField[i][j] == mark) {
                            if (gameField[i + 1][j - 1] != mark)
                                countD2 = 1;
                            else if (gameField[i + 1][j - 1] == mark)
                                countD2++;
                        }
                        if (j < size - 1 && gameField[i][j + 1] == mark && gameField[i][j] == mark)
                            countH++;
                        if (j < size - 1 && gameField[j + 1][i] == mark && gameField[j][i] == mark)
                            countV++;
                        if (countD1 == cellsInLineForWin || countH == cellsInLineForWin || countD2 == cellsInLineForWin || countV == cellsInLineForWin)
                            return true;
                }
             }
        }
        return false;
    }

    public static boolean checkDraw () {

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                if (checkCell(i, j))
                    return false;
            }
        }
        return true;
    }

    public static void playerTurn () throws IOException {
        System.out.println("\nВаш ход. Введите координаты ячейки, в формате X Y");
        do {
            int x = Integer.parseInt(reader.readLine()) -1;
            int y = Integer.parseInt(reader.readLine()) -1;
            if ( x < 0 || x > size - 1 || y < 0 || y > size - 1 ) {
                System.out.println("\nОдна или несколько координат ячейки вышли за границы поля, попробуйте еще раз.");
            } else {
                if (!checkCell(x,y)) {
                    gameField[x][y] = markX;
                    break;
                } else
                    System.out.println("\nДанная ячейка занята, поробуйте еще раз");
            }
        } while (true);
    }

    public static void algorithmTurn () {
        //таки чуток поплавило меня, так что пока без продвинутого ИИ
        Random random = new Random();
        System.out.println("\nХод оппонетна.");
        do {
            int x = random.nextInt(size);
            int y = random.nextInt(size);
            if (!checkCell(x,y)) {
                gameField[x][y] = mark0;
                System.out.println("Deep Blue V 0.0.12 сходил по координатам x=" + (x + 1) + " y=" + (y + 1) + ".");
                break;
            }
        } while (true);

    }
}
