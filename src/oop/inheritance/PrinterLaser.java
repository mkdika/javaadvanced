package oop.inheritance;

public class PrinterLaser extends Printer {
    
    private boolean warmingUp;
    
    public PrinterLaser() {}
    
    public PrinterLaser(boolean warmingUp) {
        this.warmingUp = warmingUp;
    }

    @Override
    public void printing(String content) {
        if (!warmingUp) {
            System.out.println("Printer Laser is warming up, please wait a moment.");
            warmingUp = true;
        }
        super.printing(content);
    }            
}
