package Collection;

import java.util.HashMap;
import java.util.Map;
//we are using for each loop here an for each loop can be used for
// arrays and cpllections
public class Hashmap1 {
    public static void main(String[] args) {
        HashMap <Integer,String> Animal = new HashMap<Integer,String>();
        Animal.put(1,"lion");
        Animal.put(2,"tiger");
        Animal.put(3,"cat");
        Animal.put(4,"dog");
        System.out.println("HashMap...Amimals" );
        for(Map.Entry A : Animal.entrySet()){
            System.out.println(A.getKey()+ " "+ A.getValue());

        }
    }
}
