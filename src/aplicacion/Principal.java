package aplicacion;

public class Principal {
    public static void main(String[] args) {
        //1. La suma 0 + 1 + 2 + ... + n.
        System.out.println("La suma de los primeros 10 números naturales es: " + mates.Matematicas.suma(10));
        //2. El factorial de un número.
        System.out.println("El factorial de 5 es: " + mates.Matematicas.factorial(5));
        //3. La potencia n-ésima de un número natural.
        System.out.println("El cuadrado de 5 es: " + mates.Matematicas.potencia(5, 2));
        int[] lista = {1, 2, 3, 4, 5};
        //4. La suma de los elementos de una lista de números.
        System.out.println("La suma de los elementos de la lista es: " + mates.Matematicas.sumaLista(lista, lista.length));
        //5. La media aritmética de una lista de números.
        System.out.println("La media de los elementos de la lista es: " + mates.Matematicas.media(lista, lista.length));
        //6. La desviación típica de una lista de números.
        System.out.println("La desviación típica de los elementos de la lista es: " + mates.Matematicas.desviacionTipica(lista, lista.length));
        //7. La suma de los primeros números pares hasta n asumiendo n ≥ 2. 
        System.out.println("La suma de los primeros números pares hasta 9 es: " + mates.Matematicas.sumaPares(9));
        //8. La suma de los elementos pares de una lista de enteros.
        System.out.println("La suma de los elementos pares de la lista es: " + mates.Matematicas.sumaParesLista(lista, lista.length));
    }
}