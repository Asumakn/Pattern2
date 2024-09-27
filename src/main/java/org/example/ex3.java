package org.example;

import java.util.*;

public class ex3 {
    public void sortadd(LinkedHashSet lp ,int value){
        for (int i = 0;i<lp.size();i++){

        }

    }

    public static void main(String[] args) {
        Scanner lp  = new Scanner(System.in);
        LinkedHashSet<Integer> t1 = new LinkedHashSet<Integer>();


        t1.add(13);
        t1.add(14);
        t1.add(53);
        t1.add(75);
        t1.add(23);
        t1.add(19);
        t1.add(64);
        t1.add(16);


        Iterator<Integer>  mp  = t1.iterator();
        System.out.println("Please enter a number");
        int answer  = lp.nextInt();
        int number;
        while(mp.hasNext()){
            number =  mp.next();
            if(number<answer){
                System.out.println(number);
            }

        }


    }
}
