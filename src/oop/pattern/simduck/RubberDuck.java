package oop.pattern.simduck;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class RubberDuck extends Duck {
    
    public RubberDuck() {
        super("Rubber Duck", new FlyNoWay(), new Squek());
    }

    @Override
    public void display() {
        System.out.println("It's look like Rubber Duck.");
    }
    
}
