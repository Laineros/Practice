package BookPractice;
class KeyStart {
    public static void main(String[] args) {
        String[] str = new String[1];
        str[0] = "yes";
        ExTestDrive.main(str);
    }
}
class MyEx extends Exception { }

public class ExTestDrive {
    public static void main(String[] args) {
        String test = args[0];
        System.out.print("t");
        try {
            doRisky(test);
            System.out.print("o");
        } catch (MyEx e) {
            System.out.print("a");
        } finally {
            System.out.print("w");
            System.out.println("s");
        }
    }

    static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if ("yes".equals(t)) {
            throw new MyEx();
        }
        System.out.print("r");
    }
}
