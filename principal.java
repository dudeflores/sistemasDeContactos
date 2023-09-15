import java.util.ArrayList;
import java.util.List;

public class principal {

    //Creacion de metodo para crear nueva lista de arreglos para lista de contactos
    private static List<contactos> listaDeContactos;


    //Creacion de metodo para agregar contacto
    public void agregarContacto(contactos contacto) {
        listaDeContactos.add(contacto);
    }

    //Creacion de metodo para ver contacto
    public void verContactos(){
        for (contactos contacto : listaDeContactos) {
            System.out.println("Nombre: " +contacto.getNombre());
            System.out.println("Movil: " +contacto.getMovil());
        }
    
    //Creacion de metodo para editar el contacto con cualquiera de sus propiedades
    public void editarContacto(String nombre, String nuevoNombre, String nuevoMovil, String nuevoCorreo){

        for (contactos contacto : listaDeContactos) {

            if(contacto.getNombre().equals(nombre)){
                contacto.setNombre(nuevoNombre);
                contacto.setMovil(nuevoMovil);
                contacto.setCorreo(nuevoCorreo);
                break;
            }
            else{
                System.out.println("Contacto no existe");
            }
        }

    }

    public void eliminarContacto(String nombre) {
        boolean removido = listaDeContactos.removeIf(contacto -> contacto.getNombre().equals(nombre));

        if(!removido) {
            System.out.println("No se encontro ningun contacto con el nombre proporcionado");
        }
    }
        
    }

        public static void main (String [] args) {
        
        //Constructor del objeto contactos
            contactos contacto1 = new contactos("Jose","010101", "Jose@gmail.com");
        //Simple get para corroborar que funciona el objeto creado contacto1, imprime el nombre
            System.out.println("Nombre: " +contacto1.getNombre());

            // creacion de lista arreglo -> Lista de contactos
            listaDeContactos = new ArrayList<>();


        
    }
}

