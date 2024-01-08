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
        // String str = args[0];
        // System.out.println(capVowlesLowRest(str));
    }

    public static String replaceVowels(String str) {
        String smallVowels = "aeiou";
        String bigVowels = "AEIOU";
        String newS = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == smallVowels.charAt(j))
                    newS += bigVowels.charAt(j);
            }
        }
        return newS;

    }

    public static String replaceOther(String str) {
        String lower = "bcdfghjklmnpqrstvwxyz";
        String big = "BCDFGHJKLMNPQRSTVWXYZ";
        String newS = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == lower.charAt(j))
                    newS += big.charAt(j);
            }
        }
        return newS;

    }

    public static boolean checkKind(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                return true;
            }

        }
        return false;
    }

    public static String capVowelsLowRest(String str) {
        // Write your code here:
        String smallVowels = "aeiou";
        String bigVowels = "AEIOU";
        String lower = "bcdfghjklmnpqrstvwxyz";
        String big = "BCDFGHJKLMNPQRSTVWXYZ";
        String newS = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                newS += ' ';
            else if (checkKind(str))
                newS += replaceVowels(str);
            else
                newS += replaceOther(str);

        }
        return newS;
    }

    public static String camelCase(String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
