public class BinOps {
    public static String sum(String a, String b) {
        int valueA = Integer.parseInt(a, 2);
        int valueB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(valueA+valueB);
    }

    public static String mult(String a, String b) {
        int valueA = Integer.parseInt(a, 2);
        int valueB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(valueA*valueB);
    }
}
