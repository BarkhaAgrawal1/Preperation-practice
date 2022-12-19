package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Practicecollection {
    public static void main(String[] args) {
        ArrayList<String> barkha = new ArrayList<String>();
        barkha.add (" my");
        barkha.add  ("name");
        barkha.add  ("agrawal");
        Iterator itr = barkha.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }





    }
}


