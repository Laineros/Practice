package DifTopics;

public class Enter{

    public static void main (String[] args){
        int[] array = {1,2,3};
        int[][] MultidimensionalArray = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(MultidimensionalArray[0][0]);
        for (int[] ints : MultidimensionalArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }

            System.out.println();
        }
    }
}
