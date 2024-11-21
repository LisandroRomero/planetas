package ejemplosClase;

public class planeta {
	String nombre = null;
	int satelites = 0;
	double masa = 0.0;
	double volumen = 0.0;
	int diametro = 0;
	int distanciaSol = 0;
	tipoPlaneta tipo = tipoPlaneta.ENANO;
	boolean observable = false;
	double periodoOrbitalAños = 0.0;
	double periodoRotacionDias = 0.0;
	
enum tipoPlaneta {
	GASEOSO, TERRESTRE, ENANO
}

public planeta(String nombre, int satelites, double masa, double volumen, int diametro, int distanciaSol, tipoPlaneta tipo, boolean observable, double periodoOrbitalAños, double periodoRotacionDias){
	this.nombre = nombre;
    this.satelites = satelites;
    this.masa = masa;
    this.volumen = volumen;
    this.diametro = diametro;
    this.distanciaSol = distanciaSol;
    this.tipo = tipo;
    this.observable = observable;
    this.periodoOrbitalAños = periodoOrbitalAños;
    this.periodoRotacionDias = periodoRotacionDias;
}

	
	public void imprimir() {
		System.out.println("*** VALORES ***");
		System.out.println("Nombre: " + nombre);
		System.out.println("Cantidad de satelites: " + satelites);
		System.out.println("Masa: " + masa);
		System.out.println("Volumen: " + volumen);
		System.out.println("Diámetro: " + diametro);
		System.out.println("Distancia al sol: " + distanciaSol);
		System.out.println("Tipo: " + tipo);
		System.out.println("Es observable: " + observable);
		System.out.println("Densidad del planeta: " + densidad());
		System.out.println("Es planeta exterior: " + esExterior());
		System.out.println("Periodo Orbital (Años): " + periodoOrbitalAños);
		System.out.println("Periodo de rotación (Días): " + periodoRotacionDias);
		
	}
	public double densidad() {
		double dens = masa/volumen;
		return dens;
	}
	
	public boolean esExterior() {
		double distancia = distanciaSol/149.597870;
		return distancia > 3.4;
	}
	
	public static void main(String[] args) {
		System.out.println("*** Creación planetas ***");
		
		planeta p1 = new planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, tipoPlaneta.TERRESTRE, true, 1.0, 1.0);
		
		planeta p2 = new planeta("Júpiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, tipoPlaneta.GASEOSO, true, 11.86, 0.41);
		
		p1.imprimir();
		p2.imprimir();
	}
	
	
	
	
}