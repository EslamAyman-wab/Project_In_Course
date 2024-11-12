public class T_12_Playing_Cat {
    public static void main(String[] args) {

        System.out.println( isCatPlaying( false , 35));

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            // If it's summer, the cat plays if the temperature is between 25 and 45 inclusive
            return temperature >= 25 && temperature <= 45;
        } else {
            // If it's not summer, the cat plays if the temperature is between 25 and 35 inclusive
            return temperature >= 25 && temperature <= 35;
        }
    }

}
