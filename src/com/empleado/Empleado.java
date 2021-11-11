package com.empleado;

public class Empleado {
    private String nombre;
    private String apellido;
    private Double salario;

    public Empleado(String nombre, String apellido, Double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double salarioAnual(){
        Double total = salario * 12;
        return total;
    }

    public Double aumentoSalario(){
        Double totalAumento = this.salarioAnual() * 1.10;
        return totalAumento;
    }


    public String toString(){
        return "Nombre: " + nombre + " " + apellido +
                "\nSalario Mensual: " + "$" + salario +
                "\nSalario anual: " + String.format("$" + salarioAnual()) +
                "\nSalario con aumento: " + String.format("$" + aumentoSalario());
    }
}
