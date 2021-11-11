package com.testEmpleado;

import com.empleado.Empleado;

public class TestEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Raul", "Sanchez", 20000.0);
        Empleado empleado2 = new Empleado("Paul", "Lazcano", 40000.00);

        System.out.println(empleado1);
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println(empleado2);

    }
}
