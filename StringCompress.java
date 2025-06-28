import java.util.*;

public class StringCompress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to compress: ");
        String s = sc.nextLine();
        String result = compress(s);
        System.out.println("Compressed string: " + result);
    }

    public static String compress(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        boolean hasRepetition = false;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                hasRepetition = true;
            } else {
                compressed.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        compressed.append(s.charAt(s.length() - 1)).append(count);

        // If no repetition then return original
        return hasRepetition && compressed.length() < s.length() ? compressed.toString() : s;
    }
}
