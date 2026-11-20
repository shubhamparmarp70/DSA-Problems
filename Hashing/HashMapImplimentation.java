package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplimentation {
    public static void main(String[] args){
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        m.put("gfg",10);
        m.put("ide",15);
        m.put("courses",20);
        System.out.println(m);

        for(Map.Entry<String, Integer> e : m.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        if(m.containsKey("ide")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        m.remove("ide");

        System.out.println(m.size());

        if(m.containsValue(15)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        System.out.println(m.get("ide"));
        System.out.println(m.get("practice"));
    }
}

