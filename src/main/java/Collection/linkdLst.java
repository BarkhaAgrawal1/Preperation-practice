package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linkdLst {
    public static void main(String[] args) {
        LinkedList <String> Table= new LinkedList<String>();
        Table.add("one");
        Table.add("two");
        Table.add("three");
        Iterator itr = Table.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
