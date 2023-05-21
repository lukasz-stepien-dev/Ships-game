public class Mode
{
    static void settingShips()
    {
        Board.print();
        Board.info();
        In.shipCoords();
        Console.clear();
    }
    static void settingShips(boolean checked)
    {
        Board.print();
        Board.checked();
        In.shipCoords();
        Console.clear();
    }
    static void shooting()
    {
        Board.print();
        In.shootCoords();
        Console.clear();
    }
}
