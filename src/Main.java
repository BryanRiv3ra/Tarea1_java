//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void holaMundo() {
        System.out.println("Hola, Mundo!");
    }

    public static void suma(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese 2 numeros que desee sumar");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma resultante es: " + suma);
    }
    public static void ParImpar(){

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero para ver si es par o no");
        int num1 = sc.nextInt();
        if (num1%2==0){
            System.out.println("El numero es par");}
        else{
            System.out.println("El numero es impar");
        }
    }
    public static void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero que quiere ver su factorial");
        int num1 = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num1; i++) {
            fact *= i;
        }
        System.out.println("El factorial de "+num1+" es: " + fact);
    }
    public static void Tabla(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero que desea saber la tabla de multiplicar");
        int num1 = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int resultado = num1*i;
            System.out.println(num1+" * "+i+" = "+resultado);
        }
    }
    public static void MayorMenor(){
        Scanner sc = new Scanner(System.in);
        int num,numMa,numMe;
        numMa=0;
        numMe=Integer.MAX_VALUE;
        do {
            System.out.println("ingrese un numero entero positivo");
            num = sc.nextInt();
            if (num>0){
                if (num > numMa) {
                    numMa=num;
                } else if (num<numMe) {
                    numMe=num;
                }
            }
        }   while (num >= 0);
        System.out.println("El numero Mayor es: "+numMa);
        System.out.println("El numero Menor es: "+numMe);


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Numero mayor y Menor de una serie");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    holaMundo();
                    break;
                case 2:
                    suma();
                    break;
                case 3:
                    ParImpar();
                    break;
                case 4:
                    factorial();
                    break;
                case 5:
                    Tabla();
                    break;
                case 6:
                    MayorMenor();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 7);
        scanner.close();
    }
}