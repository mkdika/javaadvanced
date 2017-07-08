

import oop.inheritance.Printer;
import oop.inheritance.PrinterInkjet;

public class Polymorphism1 {
   
    public static void main(String[] args) {                
        // Dynamic/ Runtime type Identifier.
        Printer printerA = new Printer();
        printerA.printing("Hello World");
        
        Printer printerB = new PrinterInkjet();
        printerB.printing("Hello Girld");                
    }    
}
