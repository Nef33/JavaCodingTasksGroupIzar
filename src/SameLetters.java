public class SameLetters {

    public static void main(String[] args) {
        same("abc","bac");
    }

    public static void same(String str1, String str2) {
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        int frequency=0;
        if (!(str1.length() == str2.length())) {

            System.out.println("false");

        } else if (str1.length() == str2.length()) {
            for (int j = 0; j < arr2.length; j++) {

                if ((!(str1.contains(arr2[j]))) || (!(str2.contains(arr1[j])))) {

                    System.out.println("false");

                }
            }
        }

        else{
            System.out.println("true");
        }



        }

//
//
//


        }



/*Write a return method that check if a string is build  out of the same letters as another string
* Ex: same("abc", "cab"); ==>true
* same=("abc","abb")==>false)*/