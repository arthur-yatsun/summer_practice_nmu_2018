package com.yatsun.arthur.transport.cars;

import com.yatsun.arthur.transport.Car;

/**
 * Created by arthur on 28.06.18.
 */
public class Niva implements Car{
    @Override
    public void drive() {
        System.out.println("Niva Drives");
    }

    @Override
    public void stop() {
        System.out.println("Niva stoppes");
    }
}
