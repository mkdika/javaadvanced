package oop.inheritance;

public class PrinterInkjetAio extends PrinterInkjet {
    
    public void scan() {
        System.out.println("Scanning in progress.");
    }

    @Override
    public void printing(String content) {        
        System.out.println("Printer All in One Printing...");
    }
    
    
}
