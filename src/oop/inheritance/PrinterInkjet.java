package oop.inheritance;

public class PrinterInkjet extends Printer {

    private int inkLevel;

    public PrinterInkjet() {        
        this.inkLevel = 100;        
    }

    public PrinterInkjet(int inkLevel) {
        this.inkLevel = inkLevel;        
    }

    @Override
    public void printing(String content) {
        System.out.println("Ink Level: " + inkLevel);
        super.printing(content);
        System.out.println("");
        inkLevel--;
    }   

    @Override
    public void setup() {
        super.setup(); 
        System.out.println("Ink Level= " + inkLevel);
    }
    
    public void nozzleCheck() {
        System.out.println("Checking nozzle health.");
    }
    
        
    public int getInkLevel() {
        return inkLevel;
    }

    public void setInkLevel(int inkLevel) {
        this.inkLevel = inkLevel;
    }
}
