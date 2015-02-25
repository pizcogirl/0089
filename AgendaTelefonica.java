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
}
