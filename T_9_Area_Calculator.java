public class T_9_Area_Calculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(5,6));



    }

    public static double area (double radius){

        if(radius < 0){
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);

    }
    public static double area (double x, double y){
        if(x < 0 || y < 0) {
            return -1;
        }

        return x * y;
    }
}
