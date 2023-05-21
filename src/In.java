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
    static void shipCoords()
    {
        Board.setShips(nextChar(), nextInt(), nextChar(), nextChar());
    }
}
