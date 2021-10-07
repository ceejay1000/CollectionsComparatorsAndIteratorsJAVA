package com.ceejay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        var list = new GenericList<String>();
//        var iterator = list.iterator();
//
//        while(iterator.hasNext()){
//            var current = iterator.next();
//            System.out.println(current);
//        }
       //CollectionsDemo.show();
       // ListDemo.show();

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", "e1", 34));
        customers.add(new Customer("Zelda", "e2", 33));
        customers.add(new Customer("Sven", "e3", 29));
        customers.add(new Customer("Derrick", "e4", 45));
        customers.add(new Customer("Foster", "e5", 27));
        customers.add(new Customer("Joe", "e6", 33));

        Collections.sort(customers,new EmailComparator());
        System.out.println(customers);
       // customers.stream().map(customer -> customer.getAge() > 30).if
        System.out
                .println("======================== Sorted with Inner Email comparator class ==============================");
        Collections.sort(customers,new CustomerComparator.emailComparator());
        System.out.println(customers);

        System.out
                .println("======================== Sorted with Inner Email comparator class ===============================");
        Collections.sort(customers,new CustomerComparator.ageComparator());
        System.out.println(customers);

    }
}
