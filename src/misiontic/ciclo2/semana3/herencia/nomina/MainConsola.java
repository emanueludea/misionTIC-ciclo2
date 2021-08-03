/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana3.herencia.nomina;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class MainConsola {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int n;
        do {
            System.out.println("1. Ingresar nuevo empleado");
            System.out.println("2. Listar empleados");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");

            n = scan.nextInt();
            scan.nextLine();
            switch (n) {
                case 1:
                    crearEmpleado();
                    break;
                case 2:
                    System.out.println("\n****************************");
                    for (Empleado empleado : empleados) {
                        System.out.println(empleado);
                        System.out.printf("Valor a pagar: $%,2f%n", empleado.calcularSalario());
                    }
                    System.out.println("****************************\n");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción inválida!!");
            }
        } while (n != 3);
    }

    private static void crearEmpleado() {
        System.out.println("\n\nIngrese el nombre");
        String nombre = scan.nextLine();
        System.out.println("Ingrese el documento");
        String documento = scan.nextLine();

        switch (elegirTipoEmpleado()) {
            case 1:
                System.out.println("Ingrese el salario base");
                double salarioBase = scan.nextDouble();
                empleados.add(new EmpleadoAsalariado(nombre, documento, salarioBase));
                break;
                
            case 2:
                System.out.print("\nIngrese el valor por hora: ");
                double valorHora = scan.nextDouble();
                System.out.print("\nIngrese la cantidad de horas: ");
                short horas = scan.nextShort();
                empleados.add(new EmpleadoPorHoras(nombre, documento, horas, valorHora));
                break;
                
            case 3:
                System.out.print("\nIngrese el valor de las ventas: ");
                double ventas = scan.nextDouble();
                System.out.print("\nIngrese el porcentaje de comisión: ");
                double porcentaje = scan.nextDouble();
                empleados.add(new EmpleadoPorComision(nombre, documento, ventas, porcentaje));
                break;
                
            case 4:
                System.out.println("\nIngrese el salario base");
                double salarioBase1 = scan.nextDouble();
                System.out.println("\nIngrese el valor de las ventas: ");
                double ventas1 = scan.nextDouble();
                System.out.println("\nIngrese el porcentaje de comisión: ");
                double porcentaje1 = scan.nextDouble();
                empleados.add(new EmpleadoAsalariadoPorComision(nombre, documento, salarioBase1, ventas1, porcentaje1));
                break;
                
            default:
                System.out.println("\nOpción inválida!, intenta nuevamente");
                
        }
    }

    private static short elegirTipoEmpleado() {
        short tipo;
        do {
            System.out.println("Seleccione el tipo de empleado");
            System.out.println("1. Asalariado");
            System.out.println("2. Por horas");
            System.out.println("3. Por comision");
            System.out.println("4. Asalariado mas comisión");
            System.out.print("Ingrese una opción: ");
            tipo = scan.nextShort();
        } while (tipo != 1 && tipo != 2 && tipo != 3 && tipo != 4);
        return tipo;
    }
}
