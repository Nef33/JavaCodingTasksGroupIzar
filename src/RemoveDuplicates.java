public class RemoveDuplicates {

    public static void main(String[] args) {
        removeDup("AAABBBDDHH");

    }
    public static void removeDup(String str){

        String[] arr=str.split("");
        String result="";

        for (int i = 0; i < arr.length; i++) {
            if(!result.contains(""+arr[i])){

                        result+=arr[i];

                    }
                }

        System.out.println(result);


        }


    }

/*Return a method that can remove the duplicates from String
*
* EX:("AAABBBBCCC")==> ABC*/