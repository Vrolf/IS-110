import java.util.Objects;

public class bil {
	
	String modell;
	
	bil(String modell){
		this.modell = modell;
	}

	@Override
	public int hashCode() {
		return Objects.hash(modell);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		bil other = (bil) obj;
		return Objects.equals(modell, other.modell);
	}

}