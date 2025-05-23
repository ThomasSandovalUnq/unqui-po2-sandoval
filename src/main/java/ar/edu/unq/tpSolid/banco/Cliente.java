package ar.edu.unq.tpSolid.banco;

public class Cliente {

    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private double sueldoNetoMensual;

    public Cliente(String n, String s, String d, int ed, double sueldoNetoMensual) {
        this.setNombre(n);
        this.setApellido(s);
        this.setDireccion(d);
        this.setEdad(ed);
        this.setSueldoNetoMensual(sueldoNetoMensual);
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldoNetoMensual() {
        return sueldoNetoMensual;
    }

    public void setSueldoNetoMensual(double sueldoNetoMensual) {
        this.sueldoNetoMensual = sueldoNetoMensual;
    }

    public double sueldoAnual() {
        return this.getSueldoNetoMensual()*12;
    }
}
