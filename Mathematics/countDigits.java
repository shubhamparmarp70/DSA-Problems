class countDigits {
    public static void main(String[] args) {
        int x = 225;
        System.out.println("Total number of digits in " + x + " is: " + digitCount(x));
    }
    static int digitCount(int x){
        int res = 0;
        while(x>0){
            x=x/10;
            res++;
        }
        return res;
    } 
}