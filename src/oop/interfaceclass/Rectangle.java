
package oop.interfaceclass;


public class Rectangle implements Shape2D{
    
    private double a,b;
    
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateVolume() {
        return (a*b);
    }

    @Override
    public void printShapeInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
