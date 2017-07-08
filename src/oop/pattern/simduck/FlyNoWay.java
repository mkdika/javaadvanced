package oop.pattern.simduck;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly(String name) {
        System.out.println(name+ " can't fly.");
    }
    
}
