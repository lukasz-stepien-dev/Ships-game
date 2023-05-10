public class Board
{
    static Cell[][] xyAxle = new Cell[10][10];
    static void print()
    {

    }
    static void clear()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
