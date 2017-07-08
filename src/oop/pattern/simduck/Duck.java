package oop.pattern.simduck;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public abstract class Duck {
    
    private String name;
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    
    public Duck() {}

    public Duck(String name, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.name = name;
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    
    public void swim() {
        System.out.println(name+" is swimming.");
    }
    
    public void performFly() {
        flyBehavior.fly(name);
    }
    
    public void performQuack() {
        quackBehavior.quack(name);
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
           
    public abstract void display();            
}
