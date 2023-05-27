public class FINRA {

    public static void main(String[] args) {

        FINRA();
    }

         public static void FINRA() {
             for (int i = 1; i <= 60; i++) {

                 if (i % 5 == 0 & i % 3 == 0) {

                     System.out.println("FINRA");

                 } else if (i % 5 == 0) {
                     System.out.println("RA");
                 } else if (i % 3 == 0) {
                     System.out.println("FIN");
                 } else {
                     System.out.println(i);
                 }

             }

         }
    }

/*FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.


Numbers -- odd & even
write a method which can identifies given number is even or odd
Ex:
identify(5) -> "Odd"
identify(6) -> "Even*/

