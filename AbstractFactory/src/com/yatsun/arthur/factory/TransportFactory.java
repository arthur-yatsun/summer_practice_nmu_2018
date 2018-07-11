package com.yatsun.arthur.factory;

import com.yatsun.arthur.transport.Aircraft;
import com.yatsun.arthur.transport.Car;

/**
 * Фабрика по созданию транспортных средств
 */
public interface TransportFactory {
    Car createCar();
    Aircraft createAircraft();
}
