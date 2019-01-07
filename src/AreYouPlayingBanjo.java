//Create a function which answers the question "Are you playing banjo?".
//If your name starts with the letter "R" or lower case "r", you are playing banjo!
public class AreYouPlayingBanjo {
    public static String areYouPlayingBanjo(String name) {
        if(name.charAt(0) == 'R' || name.charAt(0) == 'r'){
            return "plays banjo";
        }
        else{
            return "does not play banjo";
        }
    }
}
