package tema2;
import java.util.Scanner;

public class Ejercicio6DiaSemana {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int dia;
		System.out.println("Introduce un numero del 1 al 7: ");
		dia = sc.nextInt();
		switch(dia)
		{
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default: 
			System.out.println("Ese dia no existe.");
			break;
		}
		sc.close();
	}

}
