// Write a program to swap values of two int variables.

public class Question03 {
    public static void main(String []args){
        int x=543;
        int y=345;
        int z;
        z=x;      //value of x move into z;
        x=y;      //value of y move into x;
        y=z;      // value of z(x) move into y;
        System.out.println("After swapping value of x is "+x);
        System.out.println("After swapping value of y is "+y);
    }
}
