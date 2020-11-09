package com.collection;

import java.util.Objects;

public class Person1 {
    String firstName;
    String lastName;
    int age;

    public Person1(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o instanceof Person1) {
            Person1 p = (Person1) o;
            boolean firstNameEquals = false;
            boolean lastNameEquals = false;
            if (this.firstName == null && p.firstName == null) {
                firstNameEquals = true;
            }
            if (this.lastName == null && p.lastName == null) {
                lastNameEquals = true;
            }
            if (this.firstName != null) {
                firstNameEquals = this.firstName.equals(p.firstName);
            }
            if (this.lastName != null) {
                lastNameEquals = this.lastName.equals(p.lastName);
            }

            //return Objects.equals(this.firstName, p.firstName) && Objects.equals(this.lastName, p.lastName) && this.age == p.age;
            return firstNameEquals && lastNameEquals && this.age == p.age;

        }
        return false;
    }
}
