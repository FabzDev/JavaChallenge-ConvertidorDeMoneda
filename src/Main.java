import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcionPrincipal;
		do {

			System.out.println("\n.:MENU:.");
			System.out.println("Ingrese la opción deseada: ");
			System.out.println("1. Conversor de moneda");
			System.out.println("2. Conversor de velocidad");
			System.out.println("3. Salir\n");
			opcionPrincipal = scan.nextInt();

			switch (opcionPrincipal) {
			case 1:
				int opcionSecundaria;
				double cantidadAConvertir=0;
				do {
					System.out.println("Ingrese la opción deseada: ");
					System.out.println("1. Convertir COP a USD");
					System.out.println("2. Convertir COP a EUR");
					System.out.println("3. Convertir COP a GBP");
					System.out.println("4. Convertir COP a JPY");
					System.out.println("5. Convertir COP a KRW");
					System.out.println("6. Convertir USD a COP");
					System.out.println("7. Convertir EUR a COP");
					System.out.println("8. Convertir GBP a COP");
					System.out.println("9. Convertir JPY a COP");
					System.out.println("10. Convertir KRW a COP");
					System.out.println("11. Salir");
					opcionSecundaria = scan.nextInt();
					
					System.out.println("Ingresa la cantidad que desea convertir: ");
					cantidadAConvertir = scan.nextDouble();
					
					MoneyConversion convertidor = new MoneyConversion(cantidadAConvertir);	
					
					switch (opcionSecundaria) {
					case 1:
						System.out.println(convertidor.COP_USD);
						break;

					case 2:
						System.out.println(convertidor.COP_EUR);
						break;

					case 3:
						System.out.println(convertidor.COP_GBP);
						break;
					case 4:
						System.out.println(convertidor.COP_JPY);
						break;
					case 5:
						System.out.println(convertidor.COP_KRW);
						break;
					case 6:
						System.out.println(convertidor.USD_COP);
						break;
					case 7:
						System.out.println(convertidor.EUR_COP);
						break;

					case 8:
						System.out.println(convertidor.GBP_COP);
						break;
						
					case 9:
						System.out.println(convertidor.JPY_COP);
						break;

					case 10:
						System.out.println(convertidor.KRW_COP);
						break;

					}

				} while (opcionSecundaria != 11);
				break;

			case 2:
				System.out.println("\nEstamos trabajando en esta lógica");
				break;

			case 3:
				System.out.println("\n\nHasta pronto!");
				break;

			}

		} while (opcionPrincipal != 3);
	}
}
