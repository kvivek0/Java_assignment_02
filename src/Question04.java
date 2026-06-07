//Write a program to swap values of two int variables without using third variable.

public class Question04 {
    public static void main(String []args){
        int x=576;
        int y=478;  // without using third variable;
         x=x+y;
         y=x-y;
         x=x-y;
         System.out.println("After swapping values of x is "+x);
         System.out.println("After swapping values of y is "+y);
    }
}
