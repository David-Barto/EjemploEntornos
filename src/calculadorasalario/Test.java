package calculadorasalario;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        SueldoEmpleado.setPreciosHora(40F, 30F, 20F, 10F);
        
        System.out.printf("Introduzca categoría de empleado 1 (A, B, C o D): ");
        String categoriaEmpleado1 = entrada.next();
        System.out.printf("Introduzca horas de empleado 1: ");
        int horasEmpleado1 = entrada.nextInt();
        float sueldoEmpleado1 = SueldoEmpleado.calcularSueldo(categoriaEmpleado1, horasEmpleado1);
        
        System.out.printf("Introduzca categoría de empleado 2 (A, B, C o D): ");
        String categoriaEmpleado2 = entrada.next();
        System.out.printf("Introduzca horas de empleado 2: ");
        int horasEmpleado2 = entrada.nextInt();
        float sueldoEmpleado2 = SueldoEmpleado.calcularSueldo(categoriaEmpleado2, horasEmpleado2);
        
        System.out.printf("Introduzca categoría de empleado 3 (A, B, C o D): ");
        String categoriaEmpleado3 = entrada.next();
        System.out.printf("Introduzca horas de empleado 3: ");
        int horasEmpleado3 = entrada.nextInt();
        float sueldoEmpleado3 = SueldoEmpleado.calcularSueldo(categoriaEmpleado3, horasEmpleado3);        
        
        System.out.printf("\nSueldo Empleado 1: %.2f Euros", sueldoEmpleado1);
        System.out.printf("\nSueldo Empleado 2: %.2f Euros", sueldoEmpleado2);
        System.out.printf("\nSueldo Empleado 3: %.2f Euros", sueldoEmpleado3);
        
        System.out.printf("\nLa suma de los sueldos es: %.2f Euros", sueldoEmpleado1+sueldoEmpleado2+sueldoEmpleado3);
    }
}