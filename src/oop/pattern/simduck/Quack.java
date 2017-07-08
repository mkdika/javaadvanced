package oop.pattern.simduck;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack(String name) {
        System.out.println(name + "'s sound is QUACK QUACK!");
    }
    
}
