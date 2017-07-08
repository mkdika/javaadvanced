package oop.inheritance;

public class Printer {
    
    private String paperSize;
    private int copy;
    
    public Printer() {
        this.paperSize = "A4";
        this.copy = 1;        
    }

    public Printer(String paperSize, int copy) {
        this.paperSize = paperSize;
        this.copy = copy;        
    }
    
    public void printing(String content) {
        printing(content, paperSize, copy);
    } 
    
    public void printing(String content, String paperSize, int copy) {
        this.paperSize = paperSize;
        this.copy = copy;
        System.out.println("Printing. Paper Size: "+paperSize+", Copy: "+copy);
        for (int i=1;i<=copy;i++) {
            System.out.println("Print Result copy-"+i+":\n\t"+content);
        }        
    }
    
    public void setup() {
        System.out.println("Check printer status");
    }
        
    public String getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(String paperSize) {
        this.paperSize = paperSize;
    }

    public int getCopy() {
        return copy;
    }

    public void setCopy(int copy) {
        this.copy = copy;
    }        
}
