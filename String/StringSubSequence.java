package String;

public class StringSubSequence {

      /* 
    public static void main(String[] args){
    String str1 = "ABCDEF";
    String str2 = "ADE";
    System.out.println(isSubSequence(str1, str2));
    }

  
    static boolean isSubSequence(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int j =0;
        for(int i=0;i<n && j<m; j++){
            if(str1.charAt(i)==str2.charAt(j)){
                j++;
            }
        }
        return j==m;
    }
    */
    
    public static void main(String[] args){
    String str1 = "ABCDE";
    String str2 = "ADE";
    int n = str1.length();
    int m = str2.length();
    System.out.println(isSubSequence(str1, str2, n, m));
    }

    static boolean isSubSequence(String str1, String str2, int n, int m){
       if(m==0){
        return true;
       }
       if(n==0){
        return false;
       }
       if(str1.charAt(n-1)==str2.charAt(m-1)){
        return isSubSequence(str1, str2, n-1, m-1);
       }
       else{
        return isSubSequence(str1, str2, n-1, m);
       }
    }
    
}
