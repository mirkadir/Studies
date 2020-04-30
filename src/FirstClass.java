import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstClass {
    public static void main(String[] args) {
    factorial();
    }
    //Find unique chars
    static void uniqueChars(){
        String str = "besiktasjimnastikkulubu";
        String unique = "";
        for (int i=0; i<str.length(); i++)
            if (!unique.contains(str.charAt(i)+""))
                unique += str.charAt(i);
        System.out.println(unique);
    }
    //Swap int values
    static void swapIntegers(){
    int a = 10;
    int b = 20;
    a = a+b;
    b = a-b;
    a = a-b;
        System.out.println("The new a value is :" + a);
        System.out.println("The new b value is :" + b);
    }
    //Swap 2 String
    static void swapTwoString(){
        String a = "Hello";
        String b = "Java";
        a = a+b;
        b = a.substring(0,(a).length()-b.length());
        a = a.substring(b.length());
        System.out.println("The new a String is :" + a);
        System.out.println("The new b String is :" + b);
    }
    //Second largest array
    static void secondLargestArray(){
        int [] arry = {19,03,19,79,20};
        Arrays.sort(arry);
        System.out.println(arry[arry.length-2]);
    }
    //Maximum and minimum number in array
    static void maxMinArray(){
        int [] arry = {19,03,19,79,20};
        Arrays.sort(arry);
        int min = arry[0];
        int max = arry[arry.length-1];
        System.out.println(min);
        System.out.println(max);
    }
    static void maxMinArrayCollections(){
        List<Integer> list = Arrays.asList(19,03,19,79,20);
        Collections.sort(list);
        System.out.println("Min is: " + list.get(0));
        System.out.println("Max is: " + list.get(list.size()-1));
    }
    //Reverse the string
    static void reverseString(){
        String str = "Reverse";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }
    //Factorial of 7
    static void factorial(){        //up to 20 can use long / after 20 can't fit in long
        long f = 7;
        for (int i=7; i>0; i--)
            f = f * i;
        System.out.println(f);
    }
}
