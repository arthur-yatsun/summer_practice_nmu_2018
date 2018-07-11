package com.yatsun.arthur.transport.aircrafts;

import com.yatsun.arthur.transport.Aircraft;

/**
 * Created by arthur on 28.06.18.
 */
public class Boeing747 implements Aircraft {
    @Override
    public void fly() {
        System.out.println("Boeing flies");
    }
}
