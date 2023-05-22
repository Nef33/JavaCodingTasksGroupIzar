public class DivideWithoutOperator {
    public static void main(String[] args) {

        int number1=20;
        int number2=3;

        int result=0;

        while(number1>=number2){

            number1=number1-number2;

            result++;
        }
        System.out.println(result+" is the result");


    }
}