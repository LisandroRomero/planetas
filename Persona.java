package ejemplosClase;

public class Persona {
	String nombre;
	String apellido;
	String documento;
	int nacimiento;
	String paisNacimiento;
	char genero;
	
	Persona(String nombre, String apellido, String documento, int nacimiento, String paisNacimiento, char genero) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.nacimiento = nacimiento;
		this.paisNacimiento = paisNacimiento;
		this.genero = genero;
	}
	
	void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("DNI: " + documento);
		System.out.println("Año de nacimiento: " + nacimiento );
		System.out.println("Pais de nacimiento: " + paisNacimiento);
		System.out.println("Genero: " + genero);
	}
	
	public static void main(String[] args) {
		Persona p1 = new Persona("Leandro", "Azcurra", "45138112", 2003, "Argentina", 'M');
		p1.imprimir();
		
		
		
	}
}