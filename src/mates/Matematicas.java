package mates;

public class Matematicas {
    
    //1. La suma 0 + 1 + 2 + ... + n.

    public static int suma(int n)
    {
        if(n<=0)
        {
            return 0;
        }
        else
        {
            return n + suma(n-1);
        }
    }
    //2. El factorial de un número.

    public static int factorial(int n)
    {
        if(n<=0)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }
    //3. La potencia n-ésima de un número natural.

    public static int potencia(int n, int m)
    {
        if(m<=0)
        {
            return 1;
        }
        else
        {
            return n * potencia(n, m-1);
        }
    }
    //4. La suma de los elementos de una lista de números.
    public static int sumaLista(int[] lista, int n)
    {
        if(n<=0)
        {
            return 0;
        }
        else
        {
            return lista[n-1] + sumaLista(lista, n-1);
        }
    }
    //5. La media aritmética de una lista de números.

    public static double media(int[] lista, int n)
    {
        if(n<=0)
        {
            return 0;
        }
        else
        {
            return (double) sumaLista(lista, n) / n;
        }
    }
    //6. La desviación típica de una lista de números.

    public static double desviacionTipica(int[] lista, int n) {
        if (n <= 0) {
            return 0; 
        } else {
           
            double media = media(lista, n);
            double sumaDifCuadrado = sumaDifCuadradoRec(lista, n, media);
            return Math.sqrt(sumaDifCuadrado / n);
        }
    }
    // Método recursivo para calcular la suma de las diferencias al cuadrado

    public static double sumaDifCuadradoRec(int[] lista, int n, double media) {
        if (n == 0) {
            return 0;
        } else {
            double diferencia = lista[n - 1] - media;
            return Math.pow(diferencia, 2) + sumaDifCuadradoRec(lista, n - 1, media);
        }
    }
    //7. La suma de los primeros números pares hasta n asumiendo n ≥ 2. Por ejemplo, sumaPares(9) = 8 + 6 + 4 + 2 = 20.

    public static int sumaPares(int n) {
        if (n < 2) {
            return 0;
        } else if (n % 2 == 0) {
            return n + sumaPares(n - 2); 
        } else {
            return sumaPares(n - 1); 
        }
    }
    //8. La suma de los elementos pares de una lista de enteros. Por ejemplo, sumaParesLista([1, 2, 3, 4]) = 6.

    public static int sumaParesLista(int[] lista, int n)
    {
        if(n<=0)
        {
            return 0;
        }
        else
        {
            if(lista[n-1]%2==0)
            {
                return lista[n-1] + sumaParesLista(lista, n-1);
            }
            else
            {
                return sumaParesLista(lista, n-1);
            }
        }
    }
    
}