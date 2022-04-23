abstract class Bil{

    
    public void kjørFramover(){
        System.out.println("Kjører Framover");
        
    }
    
    public void kjørBakover(){
        System.out.println("Kjører Bakover");
    }
    
    public abstract void motortype();
    
    public abstract void merke();
    
    public abstract void model();
}

class Tesla extends Bil{
    
    public void motortype() {
        System.out.println("Elektrisk Motor");
    }
    
    public void merke() {
        System.out.println("Tesla");
    }
    
    public void model() {
        System.out.println("Model X");
    }
}

public class Abstractionfun {
    public static void main(String[] args){
        Tesla T = new Tesla();
        
        T.motortype();
        T.merke();
        T.model();
        T.kjørFramover();
        T.kjørBakover();
    }
}