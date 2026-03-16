import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        numberFromRomanNumeral("IVVII");

    }


    public static int numberFromRomanNumeral(String s) {

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;



        for (int i = 0; i < s.length(); i++) {

            int current = map.get(s.charAt(i));
            int next;

            if (i + 1 < s.length()) {
                next = map.get(s.charAt(i + 1));
            }
            else {
                next = 0;
            }

            if (current < next) {
                result -= current;
            }
            else {
                result += current;
            }

        }

        System.out.println(result);
        return result;

    }


}