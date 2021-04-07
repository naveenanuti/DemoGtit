package dummy;

public class SwappingTwoNumbers {

    public static void main(String[]args){

        int a =10, b=20;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.print(a+ "   " +b);
       /* System.out.print(" ");
        System.out.print(b);*/
    }


}
