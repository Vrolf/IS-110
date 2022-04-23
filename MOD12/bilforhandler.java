

public class bilforhandler implements bil{
    
public static void main(String[] args){
    bilforhandler BF = new bilforhandler();
    BF.merke();
    BF.model();
    BF.pris();
    BF.motor();
}

	@Override
	public void merke() {
        System.out.println("Tesla");
		
	}

	@Override
	public void model() {
		System.out.println("Model X");
		
	}

	@Override
	public void pris() {
		System.out.println("Prisen: 1 000 000");
		
	}

	@Override
	public void motor() {
		System.out.println("Elektrisk Motor");
		
	}
    
}
