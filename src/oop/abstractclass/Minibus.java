package oop.abstractclass;

public class Minibus extends Car {

    @Override
    public void fuelComsumption() {
        setFeul(getFeul()+8d);
    }    
}
