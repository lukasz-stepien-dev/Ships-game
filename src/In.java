import java.util.Map;
import java.util.Scanner;

public class In
{
    private static Scanner scanner = new Scanner(System.in);
    static char nextChar()
    {
        return scanner.next().charAt(0);
    }
    static int nextInt()
    {
        return scanner.nextInt();
    }
    static void shootCoords()
    {
        Board.shoot(nextChar(), nextInt());
    }
    static void shipCoords() {
        char isLast;
        do {
            char letter = nextChar();
            int numb = nextInt();
            isLast = nextChar();
            Board.setShips(letter, numb/*, nextChar()*/);
        } while (isLast == 'Y');

    }
}
