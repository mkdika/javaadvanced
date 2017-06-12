package oop.abstractclass;

public abstract class Car {
    
    private Double feul;    
    
    public abstract void fuelComsumption();
        
    

    public Double getFeul() {
        return feul;
    }

    public void setFeul(Double feul) {
        this.feul = feul;
    }        
}
