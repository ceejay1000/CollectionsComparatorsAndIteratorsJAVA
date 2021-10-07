package com.ceejay;

import java.util.Comparator;

public class CustomerComparator {
    
    public static class NameComparator implements Comparator<Customer> {

        @Override
        public int compare(Customer o1, Customer o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class ageComparator implements Comparator<Customer>{

        @Override
        public int compare(Customer o1, Customer o2) {
            return o1.getAge() - o2.getAge();
        }
    }

    public static class emailComparator implements Comparator<Customer> {

        @Override
        public int compare(Customer o1, Customer o2) {
            return o1.getEmail().compareTo(o2.getEmail());
        }
    }
}
