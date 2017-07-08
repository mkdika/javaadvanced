

import oop.inheritance.BentoSet;
import oop.inheritance.Biscuit;
import oop.inheritance.Burger;
import oop.inheritance.Human;


public class Polymorphism3 {
    
    public static void main(String[] args) {
        Human human = new Human();
        human.printStamina();
        
        human.eatFood(new Biscuit());
        human.printStamina();
        
        human.eatFood(new BentoSet());
        human.printStamina();
        
        human.eatFood(new Burger());
        human.printStamina();        
    }    
}
