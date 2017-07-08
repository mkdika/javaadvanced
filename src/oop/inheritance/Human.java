package oop.inheritance;

public class Human {

    private Double stamina;

    public Human() {
        stamina = 100d;
        
    }

    public void eatFood(Food food) {
        System.out.println("Eating " + food.getName());

        // 30% calories become stamina
        
        stamina = stamina + (food.getCalorie() * (30d / 100d));
    }
    
    public void printStamina() {
        System.out.println("Current stamina: " + stamina);
    }

    public Double getStamina() {
        return stamina;
    }

    public void setStamina(Double stamina) {
        this.stamina = stamina;
    }
}
