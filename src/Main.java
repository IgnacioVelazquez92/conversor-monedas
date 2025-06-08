import api.ExchangeService;
import logic.Conversor;
import models.ExchangeResponse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExchangeService servicio = new ExchangeService();
        ExchangeResponse datos = servicio.obtenerDatos();

        if (datos == null) {
            System.out.println("No se pudo obtener datos de la API. Finalizando programa.");
            return;
        }

        Conversor conversor = new Conversor(datos);
        Scanner scanner = new Scanner(System.in);

        int opcion = -1;

        while (opcion != 7) {
            System.out.println("\n===== CONVERSOR DE MONEDAS =====");
            System.out.println("1 - Peso argentino (ARS) → Dólar (USD)");
            System.out.println("2 - Dólar (USD) → Peso argentino (ARS)");
            System.out.println("3 - Real brasileño (BRL) → Dólar (USD)");
            System.out.println("4 - Dólar (USD) → Real brasileño (BRL)");
            System.out.println("5 - Peso colombiano (COP) → Dólar (USD)");
            System.out.println("6 - Dólar (USD) → Peso colombiano (COP)");
            System.out.println("7 - Salir");
            System.out.print("Elegí una opción: ");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingresá el monto a convertir: ");
                double monto = scanner.nextDouble();
                double resultado = 0;

                switch (opcion) {
                    case 1: // ARS → USD
                        resultado = monto / conversor.obtenerTasa("ARS");
                        System.out.println(monto + " ARS = " + resultado + " USD");
                        break;
                    case 2: // USD → ARS
                        resultado = monto * conversor.obtenerTasa("ARS");
                        System.out.println(monto + " USD = " + resultado + " ARS");
                        break;
                    case 3: // BRL → USD
                        resultado = monto / conversor.obtenerTasa("BRL");
                        System.out.println(monto + " BRL = " + resultado + " USD");
                        break;
                    case 4: // USD → BRL
                        resultado = monto * conversor.obtenerTasa("BRL");
                        System.out.println(monto + " USD = " + resultado + " BRL");
                        break;
                    case 5: // COP → USD
                        resultado = monto / conversor.obtenerTasa("COP");
                        System.out.println(monto + " COP = " + resultado + " USD");
                        break;
                    case 6: // USD → COP
                        resultado = monto * conversor.obtenerTasa("COP");
                        System.out.println(monto + " USD = " + resultado + " COP");
                        break;
                }
            } else if (opcion != 7) {
                System.out.println("Opción no válida. Intentalo de nuevo.");
            }
        }

        System.out.println("¡Gracias por usar el conversor!");


    }
}