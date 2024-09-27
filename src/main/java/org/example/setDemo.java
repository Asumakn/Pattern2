package org.example;

import java.util.*;

public class setDemo {
    public static void main(String[] args) {
        Comparator<String> fp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.hashCode()-o2.hashCode();
            }


        };

      /* TreeSet lp = new TreeSet();
        lp.add("Luke");
        lp.add("John");
        lp.add("Mike");
        lp.add("Dave");
        lp.add("Luke");
        System.out.println("set is: "+lp );
        Iterator<String> mp = lp.iterator();
        while(mp.hasNext()){
            String str = mp.next();
            System.out.println(str);
*/
        HashSet h1 = new HashSet();
        HashSet h2 = new HashSet();

        h1.add(12);
        h1.add(13);
        h1.add(15);
        h1.add(17);
        h1.add(19);
        h2.add(12);
        h2.add(13);
        h2.add(15);
        h2.add(16);
        h2.add(18);
        Iterator mp = h1.iterator();
    }

}
