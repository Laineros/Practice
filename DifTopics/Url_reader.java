package DifTopics;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Url_reader {
    public static void main(String[] args) throws IOException {
        URL url = new URL ("https://javarush.com");
        URLConnection connection = url.openConnection();
        try (OutputStream output = connection.getOutputStream();
             PrintStream sender = new PrintStream(output)) {
            sender.println("What's up?!");
        }
        try (InputStream input = connection.getInputStream();
             BufferedReader buf = new BufferedReader(new InputStreamReader(input))) {
            while (buf.ready()) {
                System.out.println(buf.readLine());
            }
        }
    }
}
