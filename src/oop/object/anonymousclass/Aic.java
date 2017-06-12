
package oop.object.anonymousclass;

import oop.abstractclass.Car;
import oop.interfaceclass.Shape2D;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Aic {


    public static void main(String[] args) {
        Car teslaCar = new Car() {
            
            @Override
            public void fuelComsumption() {
                System.out.println("Does not need feulxxxxx!");
            }
        };
        
        teslaCar.fuelComsumption();
        
        
//        Shape2D myShape = new Shape2D() {
//            @Override
//            public double calculateVolume() {
//                System.out.println("I rather calculate money than volume!");
//                return 1_000_000_000d;
//            }
//
//            @Override
//            public void printShapeInfo() {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        };
    }
    
}
