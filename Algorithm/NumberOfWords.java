package Algorithm;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class NumberOfWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new HashSet<>();
        do {
            String[] lines = reader.readLine().trim().split(" ");
            for (String line : lines) {
                if (!line.isEmpty()) {
                    set.add(line);
                }
            }
        }
        while (reader.ready());
        writer.write(String.valueOf(set.size()));
        reader.close();
        writer.close();
    }

    /*public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new HashSet<>();
        String input;
        while ((input = reader.readLine()) != null) {
            String[] words = input.trim().split(" ");
            for (String word : words) {
                if (!word.isEmpty()) {
                    set.add(word);
                }
            }
        }
        writer.write(String.valueOf(set.size()));
        reader.close();
        writer.close();
    }*/
}
