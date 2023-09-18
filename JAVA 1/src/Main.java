public class Main {
    static int boxVolume(int length , int breadth , int height){ // method definition
        int vol ;
        vol = length*breadth*height;
        return vol;
    }
    static void printline(){
        System.out.println("........................");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int volume=  boxVolume(10,4,6);// passing arguments
        System.out.println("vol is " + volume);

        printline();
    }

}