//  Write a program to print a number stored in a
                     // variable without its last digit.

public class Question02 {
    public static void main(String []args){
        int x=243,y;
          y=x/10;  //coz divide operator creates a point 24.3 but values
                              // always take integer so 24 would be taken.
        System.out.println("x without its last digit is "+y);
    }

}

