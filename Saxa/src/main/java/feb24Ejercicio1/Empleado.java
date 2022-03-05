package feb24Ejercicio1;

public abstract class Empleado {
	private String nombre;
	private int edad;
	private double salario;

	// Creamos la constante AUMENTO que no va a cambiar
	public final double AUMENTO = 300;

	public Empleado(String nombre, int edad, double salario) { // constructor
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombre + "\nEdad " + edad + "\nSalario: " + salario;
	}

	// El metodo se va a implementar en sus clases hijas
	public abstract boolean aumento();

}
