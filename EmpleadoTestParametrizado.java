import org.junit.jupiter.api.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class EmpleadoTestParametrizado {

    private String nombre, oficio;
    private long codEmpleado, departamento;
    private final int expResult;

    private Empleado empleado;

    public EmpleadoTestParametrizado(String nombre, long codEmpleado, String oficio, long departamento, int expResult){

        this.nombre = nombre;
        this.codEmpleado = codEmpleado;
        this.oficio = oficio;
        this.departamento = departamento;
        this.expResult = expResult;
    }

    @Parameters
    public static List<Object[]> datosEmpleado(){

        return Arrays.asList(new Object[]
                {"Pepe", 001, "Analista", 12, 2500}, new Object[] {"Luis", 031, "Programador", 01, 2000},
                new Object[] {"Marisa", 144, "Diseñador", 55, 1500}, new Object[] {"Marcos", 002, "Programador", 66, 2000}
        );
    }



    @Test
    public void comprobarOficio() {

        System.out.println("Comprobar Oficio");

        this.nombre = "";
        this.codEmpleado = 0;
        this.oficio = "";
        this.departamento = 0;

        empleado.comprobarOficio();

        int salario = empleado.getSalario();

        Assertions.assertEquals(this.expResult, salario);

    }
//
//    @Test
//    public void comprobarNombre() {
//    }
//
//    @Test
//    public void comprobarCodEmpleado() {
//    }
//
//    @Test
//    public void comprobarDepartamento() {
//    }
}
