package Principal;

import Modelo.ConsultarMoneda;
import Modelo.Moneda;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String MonedaACambiar = "";
        String CambioDeMoneda = "";

        System.out.println("""
                A que moneda desea cambiar
                1. USD -> COP
                2. COP -> USD
                3. COP -> ARS
                4. ARS -> COP
                5. SALIR
                """);

        var opt = sc.nextInt();
        switch (opt) {
            case 1:
                MonedaACambiar = "USD";
                CambioDeMoneda = "COP";
                break;
            case 2:
                MonedaACambiar = "COP";
                CambioDeMoneda = "USD";
                break;
            case 3:
                MonedaACambiar = "COP";
                CambioDeMoneda = "ARS";
                break;
            case 4:
                MonedaACambiar = "ARS";
                CambioDeMoneda = "COP";
                break;
        }

        ConsultarMoneda cons = new ConsultarMoneda();
        Moneda moneda = cons.conversion(MonedaACambiar);
        System.out.println("Cuanto desea convertir? ");
        opt = sc.nextInt();
        double resultado = opt * moneda.conversion_rates().get(CambioDeMoneda);
        System.out.println(resultado);

    }

}
