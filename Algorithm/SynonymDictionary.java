package Algorithm;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SynonymDictionary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        //Инициализация массива, заполнение значениями
        int n = Integer.parseInt(reader.readLine());
        List<String> list = new ArrayList<>();
        while (n > 0) {
            String[] words = reader.readLine().split(" ");
            list.add(words[0]);
            list.add(words[1]);
            n--;
        }
        String searchingWord = reader.readLine();
        //Ищем первое вхождения в массиве
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(searchingWord)) {
                if (i % 2 == 0) {
                    writer.write(list.get(++i));
                } else {
                    writer.write(list.get(--i));
                    break;
                }
            }
        }

        reader.close();
        writer.close();
    }
}
