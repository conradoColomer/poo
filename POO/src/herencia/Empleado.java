package herencia;

public class Empleado extends Persona {
	int num_lejago;
	String cargo;
	Double sueldo; 
	
	public Empleado() {
		
	}
	
	public Empleado(int num_legajo,
			String cargo,
			Double sueldo,
			 int id,
			String dni,
			String nombre,
			String apellido,
			String domicilio,
			String telefono ) {
		super(id, dni, nombre, apellido, domicilio, telefono); 
		this.num_lejago = num_legajo;
		this.cargo = cargo;
		this.sueldo = sueldo; 
		
	}
	
	//GETTERS y SETTERS
	
	public int getNum_lejajo() {
		return num_lejago;
	}
	public void setNum_lejajo(int num_lejago) {
		this.num_lejago = num_lejago; 
	}
	
	public String getCargo() {
		return cargo; 
	}
	public void setCargp(String cargo) {
		this.cargo = cargo; 
	}
	public Double getSueldo() {
		return sueldo; 
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo; 
	}
}
