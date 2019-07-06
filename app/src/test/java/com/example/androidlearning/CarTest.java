package com.example.androidlearning;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {


    @inject
    Car car;

    @Test

    public void test(){

        int power = 2;
        Engine engine = new PetrolEngine(power, 3, 4);
        Body body = new IronBody(2);
        Tyre tyre = new MRFTyre(3, "");
        Car car = new Car(engine, body, tyre);






















        System.out.println(car);

    }

}