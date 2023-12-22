package ru.koryshev.task2;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
class Pool {
    private String address;
    private String name;
    private double length;
    private int numberOfLanes;

    public double calculateWidth() {
        return numberOfLanes * 2.5;
    }
}