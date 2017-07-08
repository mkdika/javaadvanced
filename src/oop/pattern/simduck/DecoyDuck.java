package oop.pattern.simduck;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class DecoyDuck extends Duck {
    
    public DecoyDuck() {
        super("Decoy Duck", new FlyNoWay(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("It's look like Decoy Duck.");
    }
    
}
