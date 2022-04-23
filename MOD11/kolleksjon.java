
public class kolleksjon {
    
    public static void mian(String[] args) {
        bil b = new bil("Tesla Model X");
        bil t = new bil ("Tesla Model X");
        
        System.out.println(b.hashCode());
        System.out.println(t.hashCode());
        System.out.println(b.equals(t));
        
    }

}
