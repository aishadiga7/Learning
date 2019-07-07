package com.example.androidlearning;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {



    Car car;

    @Test

    public void test(){

        int power = 2;
        Engine engine = new PetrolEngine(power, 3, 4);
        Body body = new IronBody(2);
        Tyre tyre = new MRFTyre(3, "");
        Car car = new Car(engine, body, tyre);



        System.out.println(car);


        Person person = new Person("Aish","10"); // eager init



        Person p = new Person();

        p.name = "Aish";


        p.setName("Aish"); // lateinit




    }




    class Person{
        String name; // field
        String id;

        public Person() {
        }

        // constructor
        public Person(String name, String id) {
            this.name = name;
            this.id = id;
        }

        // method
        public void setName(String name) {
            this.name = name;
        }
    }





}