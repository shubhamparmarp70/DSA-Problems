package String;

public class StringFunctions {
    public static void main(String[] args){
        String str1 = "geeks";
        String str2 = "geeks";

        // Length
        System.out.println(str1.length());

        // character at index
        System.out.println(str1.charAt(3));

        // subString
        System.out.println(str1.substring(2));

        //substring from starting index to end-1 index
        System.out.println(str1.substring(2,5));

        // String comparision
        if(str1==str2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    
        String str3 = new String("geeks");
        if(str1==str3){
           System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        String s1 = "geeksforgeeks";
        String s2 = "geeks";

        // contains function
        System.out.println(s1.contains(s2));
        
        // String comparision
        System.out.println(s1.equals(s2));

        int res = s1.compareTo(s2);
        if(res==0){
            System.out.println("Same");
        }else if(res>0){
            System.out.println("s1 Greater");
        }else{
            System.out.println("s2 Greater");
        }
       
        // index of occuring string 2 in string 1
        System.out.println(s1.indexOf(s2));

        // String concatination
        s2 = s2+"for geeks";

        System.out.println(s1==s2);
    }
}
