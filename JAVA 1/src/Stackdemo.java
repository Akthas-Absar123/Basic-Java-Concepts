public class Stackdemo {
    public static void main(String args[]){
        Stack s1 = new Stack();
        s1.push(5);
        s1.push(6);
        s1.push(7);
        s1.push(16);

        //s1.s[7] = 100 #cant access privately data of the stack . we only using with methods. methods are public. see Stack.java ***
        System.out.println(s1.pop());
        Stack s2 = new Stack();
    }
}
