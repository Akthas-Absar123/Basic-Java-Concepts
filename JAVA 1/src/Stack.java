public class Stack {
    private int s[]= new int[10];
    private int tos;
    Stack(){
        tos=-1;
    }
    public void push(int item){
        //tos=tos+1
        if(tos==s.length)
            System.out.println("stack is full");
        else
            s[++tos]= item;
    }
    public int pop(){
        if (tos>=0)
            return s[tos--];
        else {
            System.out.println("stack is empty");
            return -1;
        }
        //tos=tos-1;
    }
}
