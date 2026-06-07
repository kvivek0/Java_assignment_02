//  write a program to find and print unit digit of a
//                       number stored in a variable?

public class Question01 {
    public static void main(String []args){
        int x=4678,y;
        y=x%10;    // modulus (%)operator always leave remainder of that
                                  // value 8 is the remainder
        System.out.println("unit digit of x is "+y);

    }
}
