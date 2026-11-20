package Tree;

class Node{
    int key;
    Node left, right;
    Node(int k){
        key = k;
        left = right= null;
    }
}

class Distance{
    int val;
    Distance(int v){
        val = v;
    }
}
public class BurnBinaryTree {
    public static void main(String[] args){
    
         /*
                    10
                  /    \
                20      30
               /  \       \
             40   50      60
                 /  \
               70    80

           Leaf = 70
        */

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.right = new Node(60);

        root.left.right.left = new Node(70);
        root.left.right.right = new Node(80);

        Distance dist = new Distance(-1);

        burnTime(root, 70, dist);

        System.out.println("Time to burn tree = " + res);
    }
    static int res=0;
    static int burnTime(Node root, int leaf, Distance dist){
        if(root==null) return 0;
        if(root.key==leaf){
            dist.val=0;
            return 1;
        }
        Distance ldist = new Distance(-1);
        Distance rdist = new Distance(-1);
        int lh = burnTime(root.left, leaf, ldist);
        int rh = burnTime(root.right, leaf, rdist);
        if(ldist.val!=-1){
            dist.val = ldist.val+1;
            res = Math.max(res,rh+dist.val);
        }
        else if(rdist.val!=-1){
            dist.val = rdist.val+1;
            res = Math.max(res,lh+dist.val);
        }
        return Math.max(lh,rh)+1;
    }
}
