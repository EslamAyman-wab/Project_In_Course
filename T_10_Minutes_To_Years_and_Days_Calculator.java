public class T_10_Minutes_To_Years_and_Days_Calculator {
    public static void main(String[] args) {

        printYearsAndDays(525600);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // Calculate total days
        long totalDays = minutes / 1440; // 1440 minutes in a day

        // Calculate years and remaining days
        long years = totalDays / 365; // Assuming 365 days in a year
        long days = totalDays % 365;  // Remaining days after extracting years

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

}
