package Algorithm;

import java.io.*;

public class DoesTheListGrow {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = reader.readLine().split(" ");
        String answer = "YES";
        for (int i = 1; i < input.length; i++) {
            if (Integer.parseInt(input[i]) <= Integer.parseInt(input[i - 1])) {
                answer = "NO";
                break;
            }
        }
        writer.write(answer);
        reader.close();
        writer.close();
    }
}
