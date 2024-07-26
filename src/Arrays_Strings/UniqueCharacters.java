package Arrays_Strings;

import java.util.HashMap;
import java.util.Map;

/*
Check if a String(input) contains only @UniqueCharacters(T/f boolean output)
//Ignoring whitespaces
 */
public class UniqueCharacters { //1 Class def
    //2 Fixed chars range 0-65,535 @CONSTANT
    private static final int MAX_CODE = 65535;

    //3 Declaring @isUnique(f) algorithm
    public static boolean isUnique(String string) {
        //3.2 Create @HashMap to keep track of chars of @string
        Map<Character, Boolean> chars = new HashMap<>();
        //Java generics do not support primitive types directly.
        //Java generics require Objects.
        //Java's generic types, such as those used in collections (like Map, List, etc.),
        // require the use of objects rather than primitives.
        //https://chatgpt.com/c/288d413e-2c2b-4bc0-a859-d6ea6a7e667c

        //4 Iterate over each chars within @string w/ @Regular for loop
        for ( int i = 0; i < string.length(); i++) { //f
            char ch = string.charAt(i); //Retrieve char at each index position & store it in ch

            //4.1 Allowed chars range validation @codePointAt(i)
            if ( string.codePointAt(i) <= MAX_CODE) { //if 1
                //4.2 Ignore whitespace
                if (Character.isWhitespace(ch) == false) { //Nested if
                    //4.3 Try put @ch in the @HashMap chars,
                    //if already available == it's a duplicate, therefore (f) algorithm's FALSE
                    if (chars.put(ch, true) != null) {
                        return false;
                    }


                } //Inner if close




            } //if 1
            else {
                //if chars overflow valid range, print a message & return false
                System.out.println("The input string contains not valid chars");
                return false;
            }


        } //f


        //3.1 default return set to true
        return true;
    }

    //MAIN
    public static void main(String[] args) {
        //TEST (f) algorithm @isUnique
        String test = "abc defg!";
        System.out.println(isUnique(test));
    }

}
