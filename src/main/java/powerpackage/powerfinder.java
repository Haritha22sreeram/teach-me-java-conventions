package powerpackage;

public class PowerFinder {
    public static int powerOf(int base, int power) {
        int result = 1;
        for (int i = 0; i<power; i++) {
            result *= base;
        }
        return result;
    }
}
