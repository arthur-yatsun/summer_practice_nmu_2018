package com.yatsun.arthur.factory.types;

import com.yatsun.arthur.factory.TransportFactory;
import com.yatsun.arthur.transport.Aircraft;
import com.yatsun.arthur.transport.Car;
import com.yatsun.arthur.transport.aircrafts.Tu123;
import com.yatsun.arthur.transport.cars.Niva;

/**
 * Created by arthur on 28.06.18.
 */
public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new Tu123();
    }
}
