import static java.lang.System.out;

public class Board
{
    static Cell[][] xyAxle = new Cell[10][10];
    static void print()
    {
        out.print("  ");
        for (int i = 0; i < 10; i++) {
            out.print(Convert.numbToLetter(i));
            out.print("    ");
        }
        for (int i = 0; i < 11; i++) {

        }
    }
}
