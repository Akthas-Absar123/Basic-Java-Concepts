public class commandlinearg {
    static int minvalue(/*char c , double s,*/  int... vals){ // varags method to take argument values. remember this method to work with java.
        int min =Integer.MAX_VALUE; // vals[0]
        for (int k:vals){
            if (k<min)
                min=k;
        }
        return min;
    }
    public static void main(String args[]){
        int m= minvalue(4,7,9);
        System.out.println(m);
        int n = minvalue(4,2,5,8,-1);
        System.out.println(n);
        /*for (int i=0;i<args.length;i++){
            System.out.println(args[i]);*/


    }
}
//we can pass arguments through run configurations and run those arguments from for loop.
// we can also pass text file sthrough this arguments read those files also.