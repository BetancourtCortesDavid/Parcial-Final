import java.util.Scanner;

public class Principal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		//doy las opciones al usuario y le pregunto
			Scanner sc = new Scanner(System.in);
			System.out.println("Seleccione que tipo de salario desea conocer\n");
			System.out.println("Marque 1 para desarrollador Front\n");
			System.out.println("Marque 2 para desarrollador Back\n");
			int option = sc.nextInt();
			
		//Defino mis casos y sus resultados
		switch (option) {
		
		case 1 :{
			OperacionEmpleado sueldo = new DesarrolladorFrontend();
			System.out.println(sueldo.devolverSalario());
			break;
		}
		
		case 2:{
			OperacionEmpleado sueldo = new DesarrolladorBackend();
			System.out.println(sueldo.devolverSalario());
			break;
		}
		default:
			System.out.println("Entrada invalida");
		}
	}

}
