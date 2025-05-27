package conversor.andres.principal;

import conversor.andres.modelos.ConsultarMoneda;
import conversor.andres.modelos.ConvertirMoneda;

import java.util.Scanner;

public class PrincipalConversorDeMoneda {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0 ;
        while(opcion != 8){
            System.out.println("****************************************\n " +
                    "Bienvenido al conversor de monedas\n\n" +
                    "Ingrese la conversionque desea realizar\n\n"+
                    "1. Dolar a peso aregentino\n"+
                    "2. Peso argentino a Dollar\n"+
                    "3. Dollar a Real Brasileño\n"+
                    "4. Real Brasileño a dolla\n"+
                    "5. Dollar a peso Colombiano\n"+
                    "6. Peso Colombiano a Dollar\n"+
                    "7. Convertir a otra moneda\n"+
                    "8. Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch(opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo de la aplicacion");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

    }
}
