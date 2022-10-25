import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        //Strings-- collections of characters enclosed by quotation marks "a;lksdfjlka"
        //0123456789 -- position
        String myStr = "howdy yall";
        //strings are immutable -- no mutator or modifier methods in the string class

        out.println(myStr.length()); //total quantity counting spaces
        out.println(myStr.indexOf("y")); //where it is in the string
        out.println(myStr.indexOf("How")); //where is begins
        out.println(myStr.lastIndexOf("y")); //looks from the right
        out.println(myStr.charAt(7)); //what character is at that location
        out.println(myStr.substring(4)); // creates a string from the number
        out.println(myStr.substring(4,8)); // creates a string from the range

        myStr.toUpperCase(); //returns the original ALL UPPERCASE
        out.println(myStr);
        myStr = myStr.toUpperCase();
        out.println(myStr);
        //compareTo vs equals
        String s1 = "one";
        String s2 = "two";
        out.println(s1.equals("one")); //boolean -- checks to see if same sting
        out.println(s1.compareTo(s2)); //
        out.println(s2.compareTo(s1));
    }
}