//What will be the result of an expression - 47|29;?

public class Question08 {
    public static void main(String []args){
        int x=47;      // binary of 47 is =00101111;
        int y=29;      // binary of 29 is =00011101;
        int z=47|29;    //after "OR" operation answer is 00111111 that is 63 ;
        System.out.print(z);
    }
}
