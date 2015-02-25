import java.util.HashMap;

/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    // Un diccionario para la agenda
    private HashMap<String, String> agenda;

    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        // Inicializamos la agenda
        agenda = new HashMap();
    }

    /**
     * Introduce un numero en la agenda
     * @param name El nombre del contacto
     * @param number El numero de telefono del contacto
     */
    public void enterNumber(String name, String number)
    {
        agenda.put(name, number);
    }
    
    /**
     * Busca el telefono de un contacto introduciendo el nombre y lo imprime por pantalla
     * @param name El nombre del contacto
     */
    public void lookupNumber(String name)
    {
        String texto = agenda.get(name);
        if (texto != null)
        {
            System.out.println("El número de " + name + " es " + texto);
        }
        else
        {
            System.out.println("El nombre introducido no existe en la agenda");
        }
    }
}
