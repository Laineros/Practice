package BookPractice;

public class WrappersOfPrim {
    Integer i = 5;
    int j;
    public static void main(String[] args) {
        WrappersOfPrim wrappers = new WrappersOfPrim();
        wrappers.go();
    }
    public void go() {
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}
