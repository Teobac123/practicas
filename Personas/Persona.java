package practicas.Personas;
import java.util.Scanner;

public class Persona{

        Scanner s = new Scanner(System.in);

        //Atributos
        private String nombre;
        private String apellido;
        private int edad = 19;
        private String nacionalidad;
        private int DNI;
        private String sexo;

        //Constructores
        public Persona(){}  

        public Persona(String nombre, String apellido) {
                this.nombre = nombre;
                this.apellido = apellido;
        }

        public Persona(String nombre, String apellido, int DNI) {
                this.nombre = nombre;
                this.apellido = apellido;
                this.DNI = DNI;
        }
        
        public Persona(String nombre, String apellido, int edad, String nacionalidad, int DNI, String sexo){

                this.nombre = nombre;
                this.apellido = apellido;
                this.edad = edad;
                this.nacionalidad = nacionalidad;
                this.DNI = DNI;
                this.sexo = sexo;
        }

        //Métodos

        //GETTER
        public String dimeNombre(){
                return "El nombre es " + nombre;
        }
        public String dimeApellido(){
                return "El apellido es " + apellido;
        }
        public String dimeNombreCompleto(){
                return "El nombre completo es " + nombre + " " + apellido;
        }
        public String dimeEdad(){
                return "La edad de " + nombre + " " + apellido + " es " + edad;
        }
        public String dimeNacionalidad(){
                return "La nacionalidad de " + nombre + " " + apellido + " es " + nacionalidad;
        }
        public String dimeDNI(){
                return "El DNI de " + nombre + " " + apellido + " es " + DNI;
        }
        public String dimeSexo(){
                return "El sexo de " + nombre + " " + apellido + " es " + sexo;
        }

        @Override
        public String toString() {
                return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", nacionalidad="
                                + nacionalidad + ", DNI=" + DNI + ", sexo=" + sexo + "]";
        }


        //SETTER
        public void setNombre() {
                System.out.println("Escribe tu nombre: ");
                nombre = s.nextLine();
        }

        public void setApellido() {
                System.out.println("Escribe tu apellido: ");
                apellido = s.nextLine();
        }

        public void setEdad() {
                System.out.println("Escribe tu edad: ");
                s.nextInt();
        }

        public void setNacionalidad(String nacionalidad) {
                this.nacionalidad = nacionalidad;
        }

        public void setDNI(int DNI) {
                this.DNI = DNI;
        }

        public void setSexo(String sexo) {
                System.out.println("Escribe tu sexo: ");
                sexo = s.nextLine();
        }
}