
public class Empleado {

	//crear los atributos
	private String name;
	private String lastName;
	private String adress;
	private int dni;
	private double salary;
	private char sexo;
	
	protected double SALARIO_MINIMO = 980000;
	protected double DESCUENTO_EPS = 4;
	protected double DESCUENTO_FP = 4;
	
	
	//Sobrecarga
	//constructor con todos los atributos
	public Empleado(String name, String lastName, String adress, int dni, double salary, char sexo) {
		this.name = name;
		this.lastName = lastName;
		this.adress = adress;
		this.dni = dni;
		this.salary = salary;
		this.sexo = sexo;
	}
		
	//constructor con Nombre. Apellidos, Dirección, DNI y Salario
	public Empleado(String name, String lastName, String adress, int dni, double salary) {
		this.name = name;
		this.lastName = lastName;
		this.adress = adress;
		this.dni = dni;
		this.salary = salary;
			
	}

	//constructor con direccion, DNI y sexo
	public Empleado(String adress, int dni, char sexo) {
		this.adress = adress;
		this.dni = dni;
		this.sexo = sexo;
	}

	//constructor con nombre, apellido, DNI, salario y sexo
	public Empleado(String name, String lastName, int dni, double salary, char sexo) {
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
		this.salary = salary;
		this.sexo = sexo;
	}
	
	//Constructor por defecto
	public Empleado() {
	}

	//métodos Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
}
