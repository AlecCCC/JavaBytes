
public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome("apple"));

    }

    public static boolean isPalindrome(String word) {

        String palindrome = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            char charToAppend = word.charAt(i);
            palindrome += charToAppend;

        }

        System.out.println(word);
        System.out.println(palindrome);

        return palindrome.equals(word);

    }


}