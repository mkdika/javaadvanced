
package oop.object.innerclass;

import java.util.List;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Laptop {
    
   private Cpu cpu;
   private Keyboard keyboard;
   private Monitor monitor;   
   private List<ProcessItem> processItem;

    public Laptop(Cpu cpu, Keyboard keyboard, Monitor monitor) {
        this.cpu = cpu;
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
   
    class ProcessItem {
        
        private int id;
        private Object content;

        public ProcessItem(int id, Object content) {
            this.id = id;
            this.content = content;
        }                        
    }
    
    
}
