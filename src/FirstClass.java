public class FirstClass {
    public static void main(String[] args) {
    swapIntegers();
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
}
