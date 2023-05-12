import java.util.LinkedHashMap;
import java.util.Map;

public class Convert
{
    static int lettersToNumbs(char letter)
    {
        Map<Character, Integer> values = new LinkedHashMap<>();
        for (int i = 65; i < 75; i++) {
            values.put((char) i, i-65);
        }
        return values.get(letter);
    }
    static String numbsToLetters(int numb)
    {
        Map<Integer, Character> values = new LinkedHashMap<>();
        for (int i = 65; i < 75; i++)
        {
            values.put(i-65, (char) i);
        }
        return Character.toString(values.get(numb));
    }
}
