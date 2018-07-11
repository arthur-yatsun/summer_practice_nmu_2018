package com.yatsun.arthur.factory.types;

import com.yatsun.arthur.factory.TransportFactory;
import com.yatsun.arthur.transport.Aircraft;
import com.yatsun.arthur.transport.Car;
import com.yatsun.arthur.transport.aircrafts.Boeing747;
import com.yatsun.arthur.transport.cars.Porshe;

/**
 * Created by arthur on 28.06.18.
 */
public class USAFactory  implements TransportFactory{

    @Override
    public Car createCar() {
        return new Porshe();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
