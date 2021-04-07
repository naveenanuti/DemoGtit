package dummy;

public class PrimeNumbers {

   public static void main(String[] args){

       int num =100;
       for(int i=2;i<=num;i++) {
       int counter =0;
       for (int j=2;j<i;j++){
           if(i%j==0){
               counter = 1;
               break;
           }

       }

       if(counter==0) {
      System.out.print(i);
      System.out.print(" ");


       }


       }

   }




}
