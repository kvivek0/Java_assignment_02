//What will be the result of an expression - 35&83?

public class Question07 {
    public static void main(String []args){
        int x=35;        // x=00100011 =binary of 35;
        int y=83;        // y=01010011 =binary of 83;
        int z=35&83;     // answer z=00000011 after AND operation  answer is binary of 3;
        System.out.println(z);
    }
}
