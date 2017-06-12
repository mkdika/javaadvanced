package oop.interfaceclass;

public class Circle implements Shape2D{
    
    private final double PHI = 3.14;
    private double r;
    
    public Circle (double r){
        this.r = r;
    }

    @Override
    public double calculateVolume() {
        return (PHI * (r*r));
    }    

    @Override
    public void printShapeInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
