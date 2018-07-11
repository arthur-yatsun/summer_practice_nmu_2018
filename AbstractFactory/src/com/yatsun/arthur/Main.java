package com.yatsun.arthur;

import com.yatsun.arthur.factory.TransportFactory;
import com.yatsun.arthur.factory.types.RussianFactory;
import com.yatsun.arthur.factory.types.USAFactory;
import com.yatsun.arthur.transport.Aircraft;

/*
* Фабрика по созданию семейства объектов разных типов(в отличии от метода фабрики, где возвращался жкземпляр одного типа)
* Более расширенный вариант фабричного метода
* Объекты внутри фабрики - связаны по смыслу или по задаче
*/
public class Main {

    private static TransportFactory factory;

    public static void main(String[] args) {

        if(true){
            factory = new RussianFactory();
        } else {
            factory = new USAFactory();
        }

        factory.createAircraft().fly();
        factory.createCar();
    }
}
