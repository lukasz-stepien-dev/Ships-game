public class Main
{
    public static void main(String[] args)
    {
        Board.setEmptyCell();
        char isLast;
        do {
            isLast = Mode.settingShips();
        } while (isLast != 'Y');

        // Game loop
        while (true)
        {
            Mode.shooting();
        }
    }
}
