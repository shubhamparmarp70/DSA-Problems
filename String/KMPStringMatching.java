package String;

public class KMPStringMatching {
    public static void main(String[] args){
    String txt = "aaaaab";
    String pat = "aaaa";
    KMP(pat, txt);
    }
    static void fillLPS(String pat, int[] lps){
        int m = pat.length();
        int len = 0;
        int i = 1;
        lps[0] = 0;
        
        while(i < m){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len != 0){
                    len = lps[len-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
    
    static void KMP(String pat, String txt){
        int n = txt.length();
        int m = pat.length();
        int lps[] = new int[m];

        fillLPS(pat,lps);
        int i =0,j=0;
        while(i<n){
            if(pat.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }
            if(j==m){
                System.out.println(i-j);
                j=lps[j-1];
            }else if(i<n && pat.charAt(j)!=txt.charAt(i)){
              if(j==0){
                i++;
              }else{
                j=lps[j-1];
              }
            }
        }
    }
}
