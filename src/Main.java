public class Main
{
    public static void main(String[] args)
    {
        Board.setEmptyCell();
        for (int i = 0; i < 10; i++) {
            Mode.settingShips();
        }
        // Game loop
        while (true)
        {
            Mode.shooting();
        }
    }
}
