package oop.pattern.simduck;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly(String name) {
        System.out.println(name+ " is flying.");  
    }
    
}
