package com.yatsun.arthur.transport.cars;

import com.yatsun.arthur.transport.Car;

/**
 * Created by arthur on 28.06.18.
 */
public class Porshe implements Car {
    @Override
    public void drive() {
        System.out.println("Porshe drives");
    }

    @Override
    public void stop() {
        System.out.println("Porshe stops");
    }
}
