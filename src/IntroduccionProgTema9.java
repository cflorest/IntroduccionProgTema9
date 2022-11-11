public class IntroduccionProgTema9 {
    /*
    Crea una clase Persona con las siguientes variables:
    La edad
    El nombre
    El teléfono
    - Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la
    variable credito solo para esa clase.
    - Crea ahora un objeto de la clase Cliente que debe tener como propiedades
    la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
    - Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una
    variable salario que solo tenga la clase Trabajador.
     */

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.datosCliente(38,"Cristian", 7777777, 50000);

        Trabajador trabajador = new Trabajador();
        trabajador.datosCliente(38,"Cristian", 7777777, 50000.8);

    }

    static class Persona{
        int edad;
        String nombre;
        int telefono;

    }

    static class Cliente extends Persona{
        int credito;

        public void datosCliente(int edad, String nombre, int telefono, int credito) {
            this.edad = edad;
            this.nombre = nombre;
            this.telefono = telefono;
            this.credito = credito;

            System.out.println("Edad: "+ this.edad + " Nombre: " +this.nombre+ " Telefono " + this.telefono+ " Credito: " + this.credito);

        }

    }

    static class Trabajador extends Persona{
        double salario;

        public void datosCliente(int edad, String nombre, int telefono, double salario) {
            this.edad = edad;
            this.nombre = nombre;
            this.telefono = telefono;
            this.salario = salario;

            System.out.println("Edad: "+ this.edad + " Nombre: " +this.nombre+ " Telefono " + this.telefono+ " Salario: " + this.salario);

        }

    }


}
