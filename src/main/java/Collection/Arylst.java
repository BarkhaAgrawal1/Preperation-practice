package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arylst {
    public static void main(String[] args) {
        ArrayList<String> Jungle = new ArrayList<String>();
        Jungle.add("lion");
        Jungle.add("tiger");
        Iterator itr = Jungle.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }

    }
}

