import java.util.Objects;

import static java.lang.System.out;

public class Board
{
    static Cell[][] cells = new Cell[10][10];
    static void setEmptyCell()
    {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cells[i][j] = new Cell(States.empty);
            }
        }
    }
    static void print()
    {
        out.print("   ");
        for (int i = 0; i < 10; i++) {
            out.print(Convert.numbToLetter(i));
            out.print("  ");
        }
        out.print("\n");
        for (int i = 0; i < 10; i++)
        {
            out.print(i);
            out.print(" ");
            for (int j = 0; j < 10; j++)
            {
                cells[i][j].print();
            }
            out.print("\n");
        }
    }
    static void shoot(char letter, int numb)
    {
        int convertedLetter = Convert.letterToNumb(letter);
        Cell cell = cells[numb][convertedLetter];

        if (Objects.equals(cell.getState(), States.empty))
        {
            cell.setState(States.shoot);
        }
        else if (Objects.equals(cell.getState(), States.ship))
        {
            cell.setState(States.down);
        }
    }

    static void setShips(char letter, int numb, char ship, char direction)
    {
        int convertedLetter = Convert.letterToNumb(letter);
        cells[numb][convertedLetter].setState(States.ship);
    }
}
