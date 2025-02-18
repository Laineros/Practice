package CodeWars;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder numberBuilder = new StringBuilder();
        for (int digit : numbers) {
            numberBuilder.append(digit);
        }
        String numberString = numberBuilder.toString();
        return numberString.replaceAll("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3");
    }
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
