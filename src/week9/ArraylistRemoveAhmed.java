package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraylistRemoveAhmed {
    /*
    given a list of people names: "Ahmed", "John", "Eric", "Ahmed"...
    write a java operation to remove all names named Ahmed
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Sam", "Jane", "Ahmed", "James"));

         names.removeAll(Arrays.asList("Ahmed"));

        System.out.println(names);

        System.out.println(removeAhmed(names));

        System.out.println("removeAhmed2(names) = " + removeAhmed2(names));

    }

    public static List<String> removeAhmed(List<String> names){
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            if(iterator.next().equalsIgnoreCase("Ahmed")){
                iterator.remove();
            }
        }
        return names;
    }

    public static List<String> removeAhmed2(List<String> names) {
        names.removeIf(p -> p.equals("Ahmed"));
        return names;
    }

}

