package oop.pattern.simduck;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class MallardDuck extends Duck {
    
    public MallardDuck() {
        super("Mallard Duck", new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("It's look like Mallard Duck.");
    }
    
}
