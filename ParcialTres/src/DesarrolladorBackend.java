
public class DesarrolladorBackend extends Empleado implements OperacionEmpleado{

	//Crear los Atributos variables
	private String skill;
	private String listaLenguajes[] = new String [10];
	//Atributo constante
	private double AUMENTO_VARIABLE = 5;
	
	//Constructor por defecto
	
	public DesarrolladorBackend(String name, String lastName, String adress, int dni, double salary, char sexo) {
		super(name, lastName, adress, dni, salary, sexo);
	}

	//Constructor con los 2 atributos
	
	public DesarrolladorBackend(String name, String lastName, String adress, int dni, double salary, char sexo,
			String skill, String[] listaLenguajes) {
		super(name, lastName, adress, dni, salary, sexo);
		this.skill = skill;
		this.listaLenguajes = listaLenguajes;
	}

	public DesarrolladorBackend() {
		// TODO Auto-generated constructor stub
	}

	//Metodos getter and Setter
	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String[] getListaLenguajes() {
		return listaLenguajes;
	}

	public void setListaLenguajes(String[] listaLenguajes) {
		this.listaLenguajes = listaLenguajes;
	}
	
	
	//metodo de la interface
	@Override
	public double devolverSalario() {
		// TODO Auto-generated method stub
		return (SALARIO_MINIMO+AUMENTO_VARIABLE)*((DESCUENTO_EPS+DESCUENTO_FP)/100);
	}
	
}
