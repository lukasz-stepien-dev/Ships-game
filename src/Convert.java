import java.util.LinkedHashMap;
import java.util.Map;

public class Convert
{
    static Integer lettersToNumbs(char letter)
    {
        Map<Character, Integer> values = new LinkedHashMap<>();
        for (int i = 65; i < 75; i++) {
            values.put((char) i, i-65);
        }
        return values.get(letter);
    }
}
