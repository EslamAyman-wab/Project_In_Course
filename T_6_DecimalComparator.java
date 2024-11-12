public class T_6_DecimalComparator {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(1.333,1.3334));
        System.out.println(areEqualByThreeDecimalPlaces(1.335,1.3334));



    }
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        int aInt =(int) (a *1000);
        int bInt =(int) (b *1000);
        return aInt == bInt;

    }
}
