public class GreatestCommanDivisior {
    public static void main(String[] args){
        int a =19;
        int b=38;
        System.out.println("GCD of " + a + " and " + b + " is: " +gcd(a,b));

    }
    /*
    static int gcd(int a, int b){
        int res = Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    } 
    */
   /* Euclidean Algorithm */
   /*
   static int gcd(int a, int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }    
        }
        return a;
    }
     */

    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }

    }
    
    
}
