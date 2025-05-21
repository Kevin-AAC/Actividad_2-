import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Persona> Personas = new ArrayList<>();
    // personas.add(new Persona(nombre, apellido, genero, edad));
    public static void main(String[] args) {
        //Persona[] personas = {new Persona("Juan", "Pérez", "Masculino", 25)};
        //System.out.println(personas[0].getNombreYGenero());
        CapturarDatos(Personas);
        PromedioEdad(Personas);
        PersonasGeneroMasculino(Personas);
        PersonasGeneroFemenino(Personas);

    }
    public static void CapturarDatos(ArrayList<Persona> personas){
        int i = 1;
        while (i <= 5) {
            System.out.println("Ingresa tu nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingresa tu apellido: ");
            String apellido = scanner.nextLine();
            System.out.println("Ingresa tu genero: ");
            String genero = scanner.nextLine();
            System.out.println("Ingresa tu edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            Personas.add(new Persona(nombre,apellido,genero,edad));

            i++;
        }
        for (int j = 0; j< Personas.size();j++){
            Persona p = Personas.get(j);
            System.out.println("Nombre: " + p.getNombre() + " Apellido: "+ p.getApellido() + " Genero: "+ p.getGenero());
        }
        scanner.close();
    }
    public static void PromedioEdad(ArrayList<Persona> personas){
        int sumaEdad = 0;
        for (Persona p : personas){
            int edad = p.getEdad();
            sumaEdad += edad;
        }
        int promedio = sumaEdad / personas.size();
        System.out.println("La edad promedio es :"+ promedio);
    }
    public static void PersonasGeneroMasculino(ArrayList<Persona> personas){
        PersonasPorGenero(personas, "masculino");
    }
    public static void PersonasGeneroFemenino(ArrayList<Persona> personas){
        PersonasPorGenero(personas, "femenino");
    }
    public static void PersonasPorGenero(ArrayList<Persona> personas, String genero){
        int cantidad = 0;
        for (Persona p : personas){
            if (p.getGenero().equalsIgnoreCase(genero)){
                cantidad++;
            }
        }
        System.out.println("Cantidad de personas con género " + genero + ": " + cantidad);
    }


}