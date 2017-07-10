package oop.abstractclass;

public abstract class Car {
    
    private Double feul;    
    
    public abstract void fuelComsumption() throws Exception;
        
    

    public Double getFeul() {
        return feul;
    }

    public void setFeul(Double feul) {
        this.feul = feul;
    }        
}
