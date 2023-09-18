public class Passing {
    static void increment(int a){
         a++;

    }
    public static void main(String[] args){
        int a=10;
        increment(a);
        increment(a);
        System.out.println(a);
// it is store in a stack . a++ is stored in a new memory. so we called to print a a it is give a value 10 here.
    }
}
