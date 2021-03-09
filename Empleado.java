import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class Empleado {

    private String nombre, oficio;
    private int salario;
    private String codEmpleado, departamento;
    private ArrayList <String> listaEmpleados;

    private final String minCodEmpleado = "000";
    private final String minCodDepartamento = "00";

    public String getNombre(){

        return nombre;
    }

    public String getOficio(){

        return oficio;
    }

    public String getCodEmpleado(){

        return codEmpleado;
    }

    public String getDepartamento(){

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

    public void setCodEmpleado(String codEmpleado) {

        this.codEmpleado = codEmpleado;
    }

    public void setDepartamento(String departamento) {

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

    public Empleado(String nombre, String codEmpleado, String oficio, String departamento){

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

        else{

            for (int i = 0; i <= nombre.length(); i++){

                if (String.valueOf(chNombre[i]).matches("^[0-9]$")){

                    System.out.println("Error, el nombre no puede contener dígitos");
                    System.exit(0);

                }

                else{

                    setNombre(nombre);
                    System.out.println("Nombre almacenado");
                    break;

                }

            }
        }

    }

    public void comprobarCodEmpleado(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el código del empleado");

        codEmpleado = entrada.nextLine();

        char[] charCodeEmpleado = codEmpleado.toCharArray();


        if(codEmpleado.length() == 0){

            System.out.println("Error ER1. El código del empleado no puede estar vacío.");
            System.exit(0);
        }

        else if(codEmpleado.length() > 3){

            System.out.println("Error ER1. El código del empleado no puede ser superior a 3 dígitos.");
            System.exit(0);
        }

        else {

            for (int i = 0; i <= codEmpleado.length(); i++) {

                if (String.valueOf(charCodeEmpleado[i]).matches("^[a-zA-Z]$")) {

                    System.out.println("Error ER1, el código del empleado solo puede contener dígitos positivos");
                    System.exit(0);

                }

                else {

                    if (codEmpleado.length() == 1){

                        codEmpleado = "00" + codEmpleado;
                    }

                    else if (codEmpleado.length() == 2){

                        codEmpleado = "0" + codEmpleado;
                    }

                    int codEmp = Integer.parseInt(codEmpleado);
                    int minCodEmp = Integer.parseInt(minCodEmpleado);

                    if (codEmp < minCodEmp) {

                        System.out.println("Error ER1. El código del empleado no puede ser menor o igual que cero");
                        System.exit(0);

                    }

                    else {


                        setCodEmpleado(codEmpleado);
                        System.out.println("Código de empleado almacenado");
                        break;
                    }
                }

            }
        }

    }

    public void comprobarDepartamento(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el departamento. (Dos cifras. Si no lo sabe, déjelo en blanco)");
        departamento = entrada.nextLine();

        if(departamento.length() == 0){

            System.out.println("Error ER2. El código del departamento no puede estar vacío.");
            System.exit(0);
        }

        else if(departamento.length() > 2){

            System.out.println("Error ER2, el código del departamento no puede contenr más de dos dígitos");
            System.exit(0);

        }

        else if(!departamento.matches("^[0-9]")){

            System.out.println("Error ER2. El departamento solo puede estar comprendido por dígitos positivos");
            System.exit(0);
        }



        else {

            if (departamento.length() == 1){

                departamento = "0" + departamento;
            }

            else{

                int codDep = Integer.parseInt(departamento);
                int minCodDep = Integer.parseInt(minCodDepartamento);

                if (codDep < minCodDep) {

                    System.out.println("Error ER2. El departamento no puede ser inferior o igual a 00");
                    System.exit(0);
                }


                else {

                    setDepartamento(departamento);
                    System.out.println("Departamento almacenado");
                }
            }

        }
    }

    public void add(){

        listaEmpleados = new ArrayList<>();

        listaEmpleados.add(toString());

    }

}
