package conversor.andres.modelos;

import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Moneda monedas = consulta.buscarMoneda(monedaBase);
        Double tasaConversion = monedas.getConversionRate(monedaTarget);

        if (tasaConversion == null) {
            System.out.println("No se encontró una tasa de conversión para " + monedaTarget);
            return;
        }

        System.out.println("La tasa de conversión para hoy\n1 " + monedaBase + " = " + tasaConversion + " " + monedaTarget);
        System.out.println("Ingrese la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * tasaConversion;
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedaTarget);
    }

    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
        System.out.println("Ingrese el código de la moneda base");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese el código de la moneda objetivo");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
