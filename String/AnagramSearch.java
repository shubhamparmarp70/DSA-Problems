package String;

public class AnagramSearch {
    public static void main(String[] args){
    String txt = "geeksforgeeks";
    String pat= "frog";
    System.out.println(isPresent(txt, pat));
    }

    /*static boolean isPresent(String txt, String pat){
        int n = txt.length();
        int m = pat.length();
        for(int i=0;i<=n-m;i++){
            if(areAnagram(txt,pat,i)){
                return true;
            }
        }
        return false;
    }

    static final int CHAR = 256;
    static boolean areAnagram(String txt, String pat, int i){
        int count[] = new int[CHAR];
        for(int j=0;j<pat.length();j++){
          count[pat.charAt(j)]++;
          count[txt.charAt(i+j)]--;
        }
        for(int j=0;j<CHAR;j++){
            if(count[j]!=0){
                return false;
            }
        }
        return true;
    }*/

     static final int CHAR = 256;
     static boolean isPresent(String txt, String pat) {

        int n = txt.length();
        int m = pat.length();

        if (m > n)
            return false;

        int[] patCount = new int[CHAR];
        int[] txtCount = new int[CHAR];

        // Count frequencies of pattern and first window
        for (int i = 0; i < m; i++) {
            patCount[pat.charAt(i)]++;
            txtCount[txt.charAt(i)]++;
        }

        // Slide the window
        for (int i = m; i < n; i++) {

            if (same(patCount, txtCount))
                return true;

            // Add new character
            txtCount[txt.charAt(i)]++;

            // Remove old character
            txtCount[txt.charAt(i - m)]--;
        }

        // Check the last window
        return same(patCount, txtCount);
    }

    static boolean same(int[] a, int[] b) {

        for (int i = 0; i < CHAR; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }
}
