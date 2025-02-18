package DifTopics;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class PNGReader {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://yt3.googleusercontent.com/ytc/AGIKgqNFGyRp_i3tBEwBn8MARh3C6tpRGJ10MqHCJN2q=s900-c-k-c0x00ffffff-no-rj");
            InputStream input = url.openStream();

            Path file = Path.of("C:\\Users\\leoni\\OneDrive\\Изображения\\java.png");
            Files.copy(input, file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
