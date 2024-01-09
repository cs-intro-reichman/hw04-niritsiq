public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String str = args[0];
        System.out.println(capVowelsLowRest(str));
    }

    public static String capVowelsLowRest(String str) {
        // Write your code here:

        String newS = "";
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                newS += (char) (c - 32);
            } else if ((int) c >= 65 && (int) c <= 90 && !("aeiou".indexOf(c) != -1)) {
                newS += (char) (c + 32);
            } else if ((int) c >= 65 && (int) c <= 90)
                newS += (char) (c + 32);
            else
                newS += c;

        }
        return newS;
    }

    //
    public static String camelCase(String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
