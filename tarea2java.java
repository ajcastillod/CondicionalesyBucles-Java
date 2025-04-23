import java.util.Scanner;

public class tarea2java {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // ------------------------ CONDICIONALES IF ------------------------2
        System.out.println("\n--- EJERCICIO 1: Número Positivo, Negativo o Cero ---");
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt(); // Leer el número ingresado por el usuario

        // Evaluar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        System.out.println("\n--- EJERCICIO 2: Determinar si un año es bisiesto ---");
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt(); // Leer el año ingresado por el usuario

        // Verificar si el año es bisiesto usando condiciones compuestas
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }

        // ------------------------ SWITCH ------------------------
        System.out.println("\n--- EJERCICIO 3: Días de la Semana ---");
        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = scanner.nextInt(); // Leer el número de día ingresado

        // Usamos switch para determinar el día de la semana
        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Número inválido. Debe ser entre 1 y 7.");
        }

        System.out.println("\n--- EJERCICIO 4: Menú de Opciones ---");
        System.out.println("1. Mostrar mensaje de bienvenida");
        System.out.println("2. Mostrar fecha actual");
        System.out.println("3. Salir");
        System.out.print("Ingrese una opción: ");
        int opcion = scanner.nextInt(); // Leer la opción del usuario

        // Usamos switch para manejar el menú de opciones
        switch (opcion) {
            case 1:
                System.out.println("¡Bienvenido al programa!");
                break;
            case 2:
                System.out.println("La fecha actual es: " + java.time.LocalDate.now());
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Debe ser 1, 2 o 3.");
        }

        // ------------------------ BUCLE WHILE ------------------------
        System.out.println("\n--- EJERCICIO 5: Suma de Números hasta que ingrese un número negativo ---");
        int suma = 0, num;
        System.out.println("Ingrese números para sumar (Ingrese un número negativo para terminar):");

        // Bucle while que sigue sumando números hasta que el usuario ingrese un número negativo
        while (true) {
            num = scanner.nextInt(); // Leer número ingresado
            if (num < 0) break; // Si es negativo, salimos del bucle
            suma += num; // Sumar el número ingresado
        }
        System.out.println("La suma total de los números ingresados es: " + suma);

        System.out.println("\n--- EJERCICIO 6: Repetir Acción según Usuario ---");
        String respuesta;
        do {
            System.out.println("Ejecutando acción...");
            System.out.print("¿Desea continuar? (sí/no): ");
            respuesta = scanner.next(); // Leer la respuesta del usuario
        } while (respuesta.equalsIgnoreCase("sí")); // Repetir mientras el usuario diga "sí"

        System.out.println("Programa finalizado.");

        // ------------------------ BUCLE FOR ------------------------
        System.out.println("\n--- EJERCICIO 7: Primeros 10 Números Naturales ---");

        // Usamos un bucle for para imprimir los números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Salto de línea

        System.out.println("\n--- EJERCICIO 8: Suma de los Primeros N Números Naturales ---");
        System.out.print("Ingrese un número N para calcular la suma de los primeros N números naturales: ");
        int N = scanner.nextInt(); // Leer el número N ingresado
        suma = 0;

        // Usamos un bucle for para sumar los primeros N números naturales
        for (int i = 1; i <= N; i++) {
            suma += i;
        }
        System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);

        // Cerrar el scanner para evitar fugas de memoria
        scanner.close();
    }
}
