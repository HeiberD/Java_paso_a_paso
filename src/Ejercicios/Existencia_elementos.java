package Ejercicios;

import java.util.HashSet;

public class Existencia_elementos {

    public static boolean isSubset(int[] S, int[] T) {
        // Crear un HashSet y añadir todos los elementos de T
        HashSet<Integer> setT = new HashSet<>();
        for (int element : T) {
            setT.add(element);
        }

        // Verificar si cada elemento de S está en el HashSet de T
        for (int element : S) {
            if (!setT.contains(element)) {
                return false; // Si un elemento de S no está en T, no es un subconjunto
            }
        }

        return true; // Todos los elementos de S están en T, por lo tanto, S es subconjunto de T
    }

    public static void main(String[] args) {
        int[] S = {1, 8, 5};
        int[] T = {1, 2, 3, 4, 5, 6};

        boolean result = isSubset(S, T);
        if (result) {
            System.out.println("S es subconjunto de T.");
        } else {
            System.out.println("S no es subconjunto de T.");
        }
    }
}
