package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;

public class winnersQueue {
    static Comparator<String> complength = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length()-o2.length();
        }
    };
    static PriorityQueue<Integer> lp = new PriorityQueue();
    static PriorityQueue<String> intlist = new PriorityQueue<>(complength);
    public static void main(String[] args) {
        lp.add(12);
        lp.add(43);
        lp.add(41);
        lp.add(65);
        lp.add(63);
        lp.add(45);
        while (!lp.isEmpty()){
            System.out.println(lp.remove());

        }


        intlist.add("ratirl");
        intlist.add("nemesis");
        intlist.add("bwipscope");
        intlist.add("sacre");
        intlist.add("zongoledozo");


        while (!intlist.isEmpty()){
            System.out.println(intlist.remove());

        }


    }
 class Employee implements Comparable<Employee>{
private String name;
private double salary;

     public Employee(String name, double salary) {
         this.name = name;
         this.salary = salary;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "name='" + name + '\'' +
                 ", salary=" + salary +
                 '}';
     }

     @Override
    public int compareTo(Employee o) {
       if(this.getName().length()>o.getName().length()){
           return 1;
       } else if (this.getName().length()<o.getName().length()) {
           return -1;
       }else {
           return 0;
       }
    }
}


}
