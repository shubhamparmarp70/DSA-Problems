package String;

public class ReverseWordsInString {
    public static void main(String[] args){
    String str = "Welcome to gfg";
    System.out.println(reverseWords(str));
    }

    
    static String reverseWords(String str){
        char[] chars = str.toCharArray();
        int start = 0;
        int n = chars.length;
        for(int end = 0; end < n; end++){
            if(chars[end] == ' '){
                reverse(chars, start, end - 1);
                start = end + 1;
            }
        }
        reverse(chars, start, n - 1);
        reverse(chars, 0, n - 1);
        return new String(chars);
    }

    static void reverse(char[] chars, int low, int high){
        while(low < high){
            char temp = chars[low];
            chars[low] = chars[high];
            chars[high] = temp;
            low++;
            high--;
        }
    }
    


    
}
