package c05_structures;

import java.util.ArrayList;

public class List {
    public static void main(String[] args){

        // Declaración y creación
        // Las Listas no necesitan tamaño fijo a diferencia de los Arrays
        ArrayList<String> names = new ArrayList<>(); // Forma clásica
        var numbers = new ArrayList<Integer>();     // Forma moderna

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.add("Gorka");
        names.add("Santillán");
        names.add("Soriano");
        System.out.println(names.size());

        // Acceder a los elementos
        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        // Modificar elementos
        names.set(2, "crwgorka@gmil.com");
        System.out.println(names.getLast());

        // Eliminar elementos
        names.remove(2);
        System.out.println(names.size());

        // Buscar elementos
        System.out.println(names.contains("Santillán"));

        // Limpiar ArrayList
        names.clear();
        System.out.println(names.size());

    }
}
