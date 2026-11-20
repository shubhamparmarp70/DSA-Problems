package String;
    public class CheckForRotations {
    public static void main(String[] args) {

        String str1 = "ABAB";
        String str2 = "ABBA";

        System.out.println(isRotation(str1, str2));
    }

    static boolean isRotation(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;

        return (str1 + str1).contains(str2);
    }
}

