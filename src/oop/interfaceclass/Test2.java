/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.interfaceclass;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle(2,3);
        
        Circle c = new Circle(5);
        
        printWithInfoShape(r);
        printWithInfoShape(c);
        
    }
    
    public static void printWithInfoShape(Shape2D shape) {
        
        System.out.println("VOLUME ADALAH: " + shape.calculateVolume());
        
    }
    
}
