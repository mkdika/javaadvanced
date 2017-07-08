package oop.inheritance;

public class Food {
    
    private String name;
    private Double calorie;
    
    public Food() {
        this.name = "Unindentify Food";
        this.calorie = 0d;
    }

    public Food(String name, Double calorie) {
        this.name = name;
        this.calorie = calorie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCalorie() {
        return calorie;
    }

    public void setCalorie(Double calorie) {
        this.calorie = calorie;
    }                   
}
