import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
        -----------------------------------------------------
        Bienvenidos al convertidor de monedas internacionales
        -----------------------------------------------------
        
        OPCIONES

        1 Dólar a Peso Argentino
        2 Peso Argentino a Dólar
        3 Dólar a Real Brasileño
        4 Real Brasileño a Dólar
        5 Dólar a Peso Colombiano
        6 Peso Colombiana a Dólar
        7 Salir

        Elija una opción valida
        """);

        Scanner input = new Scanner(System.in);

        try {
            var opcionElegida = Integer.valueOf(input.nextInt());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    } 
}