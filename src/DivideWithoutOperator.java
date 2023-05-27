public class DivideWithoutOperator {
    public static void main(String[] args) {

        int number1=13;
        int number2=2;

        int result=0;

        while(number1>=number2){

            number1=number1-number2;

            result++;
        }
        System.out.println(result+" is the result");


    }
}