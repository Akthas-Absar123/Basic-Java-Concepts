class Boxe {
    int length;
    int breadth;
    int height;

    static int boxcount;


    Boxe(int l, int h, int b) {
        length = l;
        breadth = b;
        height = h;
        boxcount++;

    }

    Boxe doublebox() {
        Boxe temp = new Boxe(2 * length, 2 * breadth, 2 * height);
        return temp;

    }

    static {
        System.out.println("from the static block");
        boxcount = 0;
    }

    void setDim(int l, int h, int b) {
        length = l;
        breadth = b;
        height = h;
        boxcount++;
    }

    int volume() {
        return length * breadth * height;
    }

    boolean isEqual(Boxe b1) {
        if (length == b1.length && breadth == b1.breadth && height == b1.height)
            return true;

        return false;

    }
    static void displayboxcount(){

        System.out.println("Box count is " + boxcount);
    }


}
public class Box{

    public static void main(String[] args){
        System.out.println("main starts  here ...");
        Boxe blackbox;
        System.out.println("before creatinmg box obj..");
        blackbox = new Boxe(5,6,7);
        System.out.println("after creatinmg box obj..");

        //blackbox.setDim(5,6,7);

        System.out.println("volume of box is " +  blackbox.volume());//invoke

        Boxe woodbox = new Boxe(7,8,9);

        System.out.println("volume of box is " +  woodbox.volume());
        Boxe b1 = new Boxe(5,6,7);
        System.out.println(blackbox.isEqual(b1));
        Boxe b3 =  b1.doublebox();
        System.out.println(b3.length);

        System.out.println((Boxe.boxcount));

        Boxe.displayboxcount();
    }
}