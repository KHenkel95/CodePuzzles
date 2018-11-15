/*
"Your goal is to create a function that removes the first and last characters of a string.
You're given one parameter, the original string. You don't have to worry with strings with less than two characters."
 */
public class RemoveChars {
    public static String remove(String str){
        StringBuilder sbuilder = new StringBuilder(str);
        sbuilder.deleteCharAt(0);
        sbuilder.deleteCharAt(str.length()-2);
        return sbuilder.toString();
    }
}
