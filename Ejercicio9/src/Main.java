public class Main {
    public static void main(String[] args) {

        Cliente primero = new Cliente();
        primero.edad = 20;
        primero.nombre = "Juan";
        primero.telefono = 987654321;
        primero.credito = 300;
        System.out.println(primero.edad);
        System.out.println(primero.nombre);
        System.out.println(primero.telefono);
        System.out.println(primero.credito);
    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona{
    int credito;
}
class Trabajador extends Persona{
    int salario;
}