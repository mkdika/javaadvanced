package oop.pattern.simduck;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Squek implements QuackBehavior {

    @Override
    public void quack(String name) {
        System.out.println(name+"'s sound is SQUIK SCUIK!");
    }
    
}
