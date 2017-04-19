
package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author tmorales3
 */
public class Practice1 {
    public static void main(String[] args) {
        
//        Integer x = 56;
//        int primitive = x;
//        System.out.println(primitive);
        
        List<String> list = new ArrayList<>();
        
        list.add("Beer");
        list.add("Chips");
        list.add("Vodka");
        list.add("Beer");
        
        for(String s: list)
        {
            System.out.println(s);
            
        }  
        System.out.println();
        
        Set<String> noDupes = new HashSet<>(list);
//        list.clear();
//        list.addAll(noDupes);
        list = new ArrayList<>(noDupes);
        for(String s: list)
        {
            System.out.println(s);
        }
    }
}
