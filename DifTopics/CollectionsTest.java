package DifTopics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 52, 53, 23, 54, 34, 53);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(list);
        System.out.println(Arrays.toString(arr));
    }
}
