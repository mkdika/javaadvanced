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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c = new Circle(8d);
        System.out.println("Volume: " + c.calculateVolume());
        
    }
    
}
