import java.util.Scanner;

public class ControlAcceso_Daniel_Nieto {

    //No me acordaba de como usar el MyScanner
    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {
        boolean salida;
        int intentos = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();
            if  (edad > 120 || edad <= 0) {
                System.out.println("Error, ¿seguro que estas vivo?");
                salida = false;
                intentos++;
                System.out.println("Tienes : " + intentos + " intento " + "de 3");
            } else {
                salida = true;
            }
        // Bucle
        while (intentos < 3 && !salida) {
            if (edad < 18){
                System.out.println("Acceso denegado: menor de edad.");

            } else if (edad >= 18 && edad <= 65) {
                System.out.println("Acceso permitido.");

            }
            else if (edad > 65) {
                System.out.println("Acceso con beneficios para jubilados.");

            }
            else  {
                System.out.println("Acceso incompleto.");
            }
        }
        sc.close();
    }
}