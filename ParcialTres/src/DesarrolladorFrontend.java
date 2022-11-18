
public class DesarrolladorFrontend extends Empleado implements OperacionEmpleado{

	//crear los atributos variables
	private int aniosExperienciaBootstrap;
	private boolean experienciaCloud;
	//Atributo constante
	private double AUMENTO_VARIABLE = 3;
	
	//Constructor por defecto
	public DesarrolladorFrontend(String name, String lastName, String adress, int dni, double salary, char sexo) {
		super(name, lastName, adress, dni, salary, sexo);
	}
	
	//Constructor con los dos atributos
	public DesarrolladorFrontend(String name, String lastName, String adress, int dni, double salary, char sexo,
			int aniosExperienciaBootstrap, boolean experienciaCloud) {
		super(name, lastName, adress, dni, salary, sexo);
		this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
		this.experienciaCloud = experienciaCloud;
	}

	public DesarrolladorFrontend() {
		// TODO Auto-generated constructor stub
	}

	public int getAniosExperienciaBootstrap() {
		return aniosExperienciaBootstrap;
	}

	public void setAniosExperienciaBootstrap(int aniosExperienciaBootstrap) {
		this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
	}

	public boolean isExperienciaCloud() {
		return experienciaCloud;
	}

	public void setExperienciaCloud(boolean experienciaCloud) {
		this.experienciaCloud = experienciaCloud;
	}

	

	
	//metodo de la interface
	@Override
	public double devolverSalario() {
		// TODO Auto-generated method stub
		return (SALARIO_MINIMO+AUMENTO_VARIABLE)*((DESCUENTO_EPS+DESCUENTO_FP)/100);
	}
	
	
}
