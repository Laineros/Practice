package DifTopics;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("VV");
        String str = dtf.format(ZonedDateTime.now());
        System.out.println(str);
    }
}
