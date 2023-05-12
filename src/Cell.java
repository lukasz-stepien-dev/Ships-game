public class Cell
{
    private String state;
    Cell(String s)
    {
        state = s;
    }
    public void print()
    {
        System.out.print(state);
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
