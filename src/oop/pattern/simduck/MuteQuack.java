package oop.pattern.simduck;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack(String name) {
        System.out.println(name + " have no sound, it is mute!");
    }
    
}
