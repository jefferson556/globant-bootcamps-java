package ExampleOfCollection;

public class Rol {
String rol;
	public Rol(String rol ) {
		this.rol=rol;
	}
	public String getRol()
	{
		return rol;
	}
	public String toString() {
		return rol;
	}
	@Override
	public int hashCode() {
		int hash=2;
		hash = 7 * hash + this.rol.hashCode();
		return hash;
	}
	public boolean equals(Object o){
		
		Rol rolObj = (Rol)o;
		if(rolObj.getRol().equals(this.rol)){
			return true;
		}
			return false;
	}
}
 