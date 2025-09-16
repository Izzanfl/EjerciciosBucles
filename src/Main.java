import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Ejercicio 1 Bucle

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int N = sc.nextInt();
        for ( int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        // Ejercicio 2 Bucle

        System.out.println("Ingresa un numero");
        int N1 = sc.nextInt();
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }

        // Ejercicio 3 Bucle

        System.out.println("Ingresa un numero");
        int numero = sc.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i =1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " - " + (numero * i));
        }

        // Ejercicio 4 Bucle

        System.out.println("Ingresa un numero");
        sc.nextLine();
        int n = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("La suma de los numeros del 1 al " + n + " es " + suma);

        // Ejercicio 5 Bucle

        System.out.println("Ingresa un numero");
        int n1 = sc.nextInt();

        System.out.println("Numeros pares del 1 al " + n1 + ":");
        int i = 1;
        while (i <= n1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        // Ejercicio 6 Bucle



    }
}