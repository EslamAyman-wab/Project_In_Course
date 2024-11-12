public class T_2_Speed_Converter {
    public static void main(String[] args) {
        toMilesPerHour(6.6);
        printConversion(5.5);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour <= 0) {
            return -1;
        }return Math.round(kilometersPerHour / 1.609);

    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour <= 0) {
            System.out.println("Invalid Value");
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + "km/h = " + milesPerHour + " mi/h");
    }
}
