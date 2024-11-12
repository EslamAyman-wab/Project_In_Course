public class T_5_Leap_Year_Calculator {
    public static void main(String[] args) {

    }
    public static boolean isLeapYear(int year) {
        // Step 1: Validate the year
        if (year < 1 || year > 9999) {
            return false;
        }

        // Step 2: Check if the year is divisible by 4
        if (year % 4 == 0) {
            // Step 3: Check if the year is divisible by 100
            if (year % 100 == 0) {
                // Step 4: Check if the year is divisible by 400
                if (year % 400 == 0) {
                    return true; // Step 4: It is a leap year
                } else {
                    return false; // Step 5: It is not a leap year
                }
            } else {
                return true; // Step 4: It is a leap year
            }
        } else {
            return false; // Step 5: It is not a leap year
        }
    }
}
