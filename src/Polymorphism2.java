

import oop.inheritance.Printer;
import oop.inheritance.PrinterInkjet;
import oop.inheritance.PrinterInkjetAio;

public class Polymorphism2 {
   
    public static void main(String[] args) {                
        // Dynamic/ Runtime type Identifier.
        Printer printerA = new Printer();
        printerA.printing("Hello World");
        
        System.out.println("");        
        
        Printer printerB = new PrinterInkjet();
        printerB.printing("Hello Girl!");  
       
                
        System.out.println("");                
        
//        // Sub-Casting
        ((PrinterInkjet) printerB).nozzleCheck();
       // printerInkjet.nozzlecheck
       
//        // sub-casting error?
//         ((PrinterInkjet) printerA).setup();
       
        System.out.println("");
        Printer printerC = new PrinterInkjetAio();
        ((PrinterInkjet)printerC).nozzleCheck();
        ((PrinterInkjetAio)printerC).scan();
        printerC.printing("Hello A");
        ((PrinterInkjet)printerC).printing("Hello B");
        ((PrinterInkjetAio)printerC).printing("Hello C");
        
        System.out.println("");
        PrinterInkjet printerD = new PrinterInkjetAio();
        printerD.nozzleCheck();     
        
        
    }    
}
