package ru.koryshev.task2;

import lombok.*;

@Getter
@Setter
public class NewPool extends Pool {
    private double depth;

    public NewPool(String address, String name, double length, int numberOfLanes, double depth) {
        super(address, name, length, numberOfLanes);
        this.depth = depth;
    }
}
