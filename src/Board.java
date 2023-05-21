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

    static void info()
    {
        out.println("[Ustawianie statku] Podaj kordynaty np. \"A 0 (Y - po tym ustawieniu chce zakonczyc, N - chce dalej)\"");
    }

    static void checked()
    {
        out.println("[Ustawianie statku] To miejsce jest juz zajete!");
        out.println("[Ustawianie statku] Podaj kordynaty np. \"A 0 (Y - po tym ustawieniu chce zakonczyc, N - chce dalej)\"");
    }

    static void infoShoot()
    {
        out.println("[Strzelanie] Podaj kordynaty np. \"A 0\"");
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

    static void setShips(char letter, int numb)
    {
        boolean checked = true;
        int convertedLetter = Convert.letterToNumb(letter);
        if (Objects.equals(cells[numb][convertedLetter].getState(), States.empty))
        {
            cells[numb][convertedLetter].setState(States.ship);
        }
        else
        {
            Mode.settingShips(checked);
        }
    }

}
