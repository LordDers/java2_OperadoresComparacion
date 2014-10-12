import java.util.Scanner;

public class OperadoresComparacion
{
	public static void main (String args[])
	{
		int nota;
		//int[] Array = {1,2,3,4,5,6,7,8,9,10};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Ingrese la nota obtenida: ");
		nota = sc.nextInt();

		/*if (nota != Array)
		{
			if (nota == 0)
			{
				System.out.println("\n No se puede sacar menos de cero");
			}
			if (nota >= 11)
			{
				System.out.println("\n No se puede sacar más de diez");
			}
		}*/

		if (nota < 0 || nota >= 11)
		{
			if (nota == 0)
			{
				System.out.println("\n No se puede sacar menos de cero");
			}
			if (nota >= 11)
			{
				System.out.println("\n No se puede sacar más de diez");
			}
		}

		else if (nota == 0)
		{
			System.out.println("\n La nota obtenida: " + nota + " es MUY INSUFICIENTE");
		}

		else if (nota > 0 && nota <= 4)
		{
			System.out.println("\n La nota obtenida: " + nota + " es INSUFICIENTE");
		}

		else if (nota == 5)
		{
			System.out.println("\n La nota obtenida: " + nota + " es SUFICIENTE");
		}

		else if (nota == 6)
		{
			System.out.println("\n La nota obtenida: " + nota + " es BIEN");
		}

		else if (nota == 7 || nota == 8)
		{
			System.out.println("\n La nota obtenida: " + nota + " es MUY BIEN");
		}

		else if (nota == 8 || nota <= 9)
		{
			System.out.println("\n La nota obtenida: " + nota + " es NOTABLE");
		}

		else if (nota == 10)
		{
			System.out.println("\n La nota obtenida: " + nota + " es SOBRESALIENTE");
		}

	}
}
