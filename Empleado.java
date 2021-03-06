import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class Empleado {

    private String nombre, oficio;
    private int salario;
    private long codEmpleado, departamento;
    private ArrayList <String> listaEmpleados;

    public String getNombre(){

        return nombre;
    }

    public String getOficio(){

        return oficio;
    }

    public long getCodEmpleado(){

        return codEmpleado;
    }

    public long getDepartamento(){

        return departamento;
    }

    public int getSalario(){

        return salario;
    }

    public ArrayList<String> getListaEmpleados(){

        return listaEmpleados;
    }

    public void setNombre(String nombre){

        this.nombre = nombre;
    }

    public void setCodEmpleado(long codEmpleado) {

        this.codEmpleado = codEmpleado;
    }

    public void setDepartamento(long departamento) {

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

    public Empleado(String nombre, long codEmpleado, String oficio, long departamento){

        this.nombre = nombre;
        this.codEmpleado = codEmpleado;
        this.oficio = oficio;
        this.departamento = departamento;

    }

    @Override
    public String toString() {
        return "Empleado{ " +
                "nombre = '" + nombre + '\'' +
                ", oficio = '" + oficio + '\'' +
                ", codEmpleado = " + codEmpleado +
                ", departamento = " + departamento +
                ", salario = " + salario + '€' +
                '}';
    }

    public void comprobarOficio(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el oficio");

        oficio = entrada.nextLine();
        char[] chOficio = oficio.toCharArray();

        if (oficio.isEmpty()){

            System.out.println("Error ER3, el oficio no puede estar vacío");
            System.exit(0);
        }

        else if(Character.isDigit(chOficio.length)){

            System.out.println("Error ER3, el oficio no puede contener un número");
            System.exit(0);
        }

        else {

            oficio = oficio.toUpperCase();

            if (oficio.equals("ANALISTA")){

                setOficio(oficio);
                System.out.println("Oficio de: " + oficio);
                setSalario(2500);
            }

            else if(oficio.equals("DISEÑADOR")){

                setOficio(oficio);
                System.out.println("Oficio de: " + oficio);
                setSalario(1500);

            }

            else{

                setOficio(oficio);
                System.out.println("Oficio de: " + oficio);
                setSalario(2000);
            }

            }

        }

    public void comprobarNombre(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el nombre del empleado");
        nombre = entrada.nextLine();

        char[] chNombre = nombre.toCharArray();

        if(nombre.isEmpty()){

            System.out.println("Error, el nombre no puede estar vacío");
            System.exit(0);
        }

        else if(Character.isDigit(chNombre.length)){

            System.out.println("Error, el nombre no puede contener dígitos");
            System.exit(0);
        }

        else{

            setNombre(nombre);
            System.out.println("Nombre almacenado");
        }

    }

    public void comprobarCodEmpleado(){


        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el código del empleado");
        codEmpleado = entrada.nextLong();

        String strcodEmpleado = String.valueOf(codEmpleado);

        if(strcodEmpleado.length() == 0){

            System.out.println("Error ER1. El código del empleado no puede estar vacío.");
            System.exit(0);
        }

        else if(!strcodEmpleado.matches("^[0-9] {1,3} $")){

            System.out.println("Error ER1. El código del empleado no puede ser mayor o menor de 3 cifras.");

        }

        else if (strcodEmpleado.matches("[a-zA-Z]")){

            System.out.println("Error ER1. El código del empleado no puede contener letras");
            System.exit(0);

        }

        else if (codEmpleado <= 000){

            System.out.println("Error ER1. El código del empleado no puede ser menor o igual que cero");
            System.exit(0);
        }

        else {

            setCodEmpleado(codEmpleado);
            System.out.println("Código de empleado almacenado");
        }
    }

    public void comprobarDepartamento(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el departamento. (Dos cifras. Si no lo sabe, déjelo en blanco)");
        departamento = entrada.nextLong();

        String strDepartamento = String.valueOf(departamento);

        if(!strDepartamento.matches("^[0-9] {1,2} $")){

            System.out.println("Error ER2. El departamento no puede ser superior o inferior a dos dígitos");
        }

        else if (strDepartamento.matches("[a-zA-Z]")){

            System.out.println("Error ER2. El departamento no puede contener letras o caracteres especiales");
            System.exit(0);
        }

        else if (departamento <= 00){

            System.out.println("Error ER2. El departamento no puede ser inferior o igual a 00");
        }

        else {

            setDepartamento(departamento);
            System.out.println("Departamento almacenado");
        }
    }

    public void add(){

        listaEmpleados = new ArrayList<>();

        listaEmpleados.add(toString());

    }

}
