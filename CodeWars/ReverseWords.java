package CodeWars;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("double  spaces"));
    }
    /*public static String reverseWords(final String original) {
        String[] words = original.split(" ");
        StringBuilder reversed = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            for(int j = words[i].length()-1; j >= 0; j--) {
                reversed.append(words[i].charAt(j));
            }
            if (i == words.length-1) {
                continue;
            }
            reversed.append(' ');
        }
        return "\""+reversed + "\"";
    }*/
    public static String reverseWords(final String original) {
        StringBuilder reversed = new StringBuilder();
        int length = original.length();
        int i = 0;
        while (i < length) {
            if (original.charAt(i) == ' ') {
                int start = i;
                while (i < length && original.charAt(i) == ' ') {
                    i++;
                }
                reversed.append(original, start, i);
            } else {
                int start = i;
                while (i < length && original.charAt(i) != ' ') {
                    i++;
                }
                for (int j = i - 1; j >= start; j--) {
                    reversed.append(original.charAt(j));
                }
            }
        }

        return reversed.toString();
    }
}
