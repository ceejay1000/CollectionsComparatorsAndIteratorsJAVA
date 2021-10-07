package com.ceejay;

public class Customer implements Comparable<Customer> {
    private String name;
    private String email;
    private int age = 0;

    public Customer(String name, String email, int age){

        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String toString(){
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Customer o) {
//        return o.name.compareTo(this.name);
        return this.name.compareTo(o.name);
    }
}
