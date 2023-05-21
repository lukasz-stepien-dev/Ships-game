public class Mode
{
    static char settingShips()
    {
        Board.print();
        Board.info();
        char isLast = In.shipCoords();
        Console.clear();
        return isLast;
    }
    static char settingShips(boolean checked)
    {
        Board.print();
        Board.checked();
        char isLast = In.shipCoords();
        Console.clear();
        return isLast;
    }
    static void shooting()
    {
        Board.print();
        Board.infoShoot();
        In.shootCoords();
        Console.clear();
    }
}
