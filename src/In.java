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
    static void coords()
    {
        char y = scanner.next().charAt(0);
        int x = scanner.nextInt();
        Board.shoot(y, x);
    }
}
