public class Overloadmax {
    static int max(int a,int b) {
        return a > b ? a : b;

    }// overloading is to use same object
    static double max(double a,double b) {
        return a > b ? a : b;
    }
    public static void main(String args[]){
        System.out.println(max(5,7));
        System.out.println(max(5.5,6.7));

        System.out.println(Math.abs(-44.5));
    }
}
