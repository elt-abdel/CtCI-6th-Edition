package Q1_02_Check_Permutation;

// given two strings, write a method to decide if one is a permutation of the other (anagram)

// isPerm(String s, String n)
// return true or false

public class MySolution {
    public static void main(String[] args) {

        String[][] pairs = { { "apple", "papel" }, { "carrot", "tarroc" }, { "hello", "llloh" } };
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }
    }

    public static boolean permutation(String s, String t) {
        return sort(s).equals(sort(t));
    }

    public static String sort(String s) {
        System.out.println("string " + s);
        char[] content = s.toCharArray();
        for (char c : content) {
            System.out.println("array " + c);
        }
        java.util.Arrays.sort(content);
        for (char c : content) {
            System.out.println("Sorted array " + c);
        }
        return new String(content);
    }
}
