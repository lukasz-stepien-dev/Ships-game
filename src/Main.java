public class Main
{
    public static void main(String[] args)
    {
        Board.setEmptyCell();
        Mode.settingShips();
        // Game loop
        while (true)
        {
            Mode.shooting();
        }
    }
}
