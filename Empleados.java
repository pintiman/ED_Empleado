import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class Empleado {

    private String nombre, oficio;
    private int codEmpleado, departamento, salario;

    public String getNombre(){
        return nombre;
    }

    public String getOficio(){
        return oficio;
    }

    public int getCodEmpleado(){
        return codEmpleado;
    }

    public int getDepartamento(){
        return  departamento;
    }

    public int getSalario(){
        return salario;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Empleado(){


    }

    public Empleado(String nombre, int codEmpleado, String oficio, int departamento){

        this.nombre = nombre;
        this.codEmpleado = codEmpleado;
        this.oficio = oficio;
        this.departamento = departamento;

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", oficio='" + oficio + '\'' +
                ", codEmpleado=" + codEmpleado +
                ", departamento=" + departamento +
                ", salario=" + salario +
                '}';
    }

    public void comprobarOficio(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el oficio");
        oficio = entrada.nextLine();

        char[] chOficio = oficio.toCharArray();

        while((oficio != "Analista") || (oficio != "Diseñador") || (oficio != "Programador")){

            if (oficio.isEmpty()){

                System.out.println("Error, el oficio no puede estar vacío");
            }

            else if(oficio.matches("\\d")){

                System.out.println("Error, el oficio no puede empezar por un número");
            }

            else if(Character.isUpperCase(chOficio[1]) == true){

                System.out.println("Error en el formato. Solo la primera letra puede ser mayúscula");
            }

        }

        if (oficio == "Analista"){

            setSalario(2500);
        }

        else if(oficio == "Diseñador"){

            setSalario(1500);
        }

        else{

            setSalario(2000);
        }
    }

}
