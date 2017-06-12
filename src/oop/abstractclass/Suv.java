package oop.abstractclass;

public class Suv extends Car {

    @Override
    public void fuelComsumption() {
        setFeul(getFeul()-10d);
    }    
}
