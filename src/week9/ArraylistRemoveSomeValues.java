package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistRemoveSomeValues {
    public static void main(String[] args) {
        //given a list of integers 1,2,3,4,5,6 etc remove all values greater than 100
        List<Integer> numbers=new ArrayList<>(Arrays.asList(1,133, 400, 23, 88, 88));
        numbers.removeIf(p-> p>100);
        System.out.println(numbers);
    }
}
