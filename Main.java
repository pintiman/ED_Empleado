public class Main {

    public static void main(String[] args){

        Empleado empleado;

        empleado = new Empleado();


        try{

            empleado.comprobarNombre();
            empleado.comprobarCodEmpleado();
            empleado.comprobarOficio();
            empleado.comprobarDepartamento();

            System.out.println(empleado.toString());

        } catch(Exception e){

            System.out.println("No se puede añadir el empleado");

        }
    }
}
